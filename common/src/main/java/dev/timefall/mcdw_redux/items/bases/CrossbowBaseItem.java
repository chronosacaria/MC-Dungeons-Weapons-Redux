package dev.timefall.mcdw_redux.items.bases;

import dev.architectury.platform.Platform;
import dev.timefall.mcdw_redux.interfaces.IInnateEnchantment;
import dev.timefall.mcdw_redux.registries.ItemGroupsRegistry;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.client.resource.language.I18n;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.*;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

import java.util.List;
import java.util.Locale;
import java.util.Map;

public class CrossbowBaseItem extends CrossbowItem implements IInnateEnchantment {
    public final ToolMaterial material;
    public final double projectileDamage;
    public final int drawSpeed;
    public final float range;
    String[] repairIngredient;

    @SuppressWarnings("UnstableApiUsage")
    public CrossbowBaseItem(ToolMaterial material, double projectileDamage, int drawSpeed, float range, String[] repairIngredient) {
        super(
                new Item.Settings()
                        .maxCount(1)
                        .maxDamage(100 + material.getDurability())
                        .rarity(RarityHelper.fromToolMaterial(material))
                        .arch$tab(ItemGroupsRegistry.MCDW_REDUX_RANGED)

        );
        this.material = material;
        if (Platform.isModLoaded("projectile_damage")) {
            this.projectileDamage = projectileDamage;
        } else {
            this.projectileDamage = 0;
        }
        this.drawSpeed = drawSpeed;
        this.range = range;
        this.repairIngredient = repairIngredient;
    }

    public float getProjectileVelocity(ItemStack stack) {
        return hasProjectile(stack, Items.FIREWORK_ROCKET) ? 1.6F : 3.2F;
    }

    @Override
    public int getRange() {
        return (int) range;
    }

    @Override
    public int getEnchantability() {
        return material.getEnchantability();
    }

    @Override
    public boolean canRepair(ItemStack stack, ItemStack ingredient) {
        return CleanlinessHelper.canRepairCheck(repairIngredient, ingredient);
    }

    @Override
    public boolean isUsedOnRelease(ItemStack stack) {
        return stack.isOf(this);
    }

    public int getDrawSpeed() {
        return this.drawSpeed;
    }

    @Override
    public ItemStack getDefaultStack() {
        return getInnateEnchantedStack(this);
    }

    @Override
    public Map<Enchantment, Integer> getInnateEnchantments() {
        return null;
    }

    @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        super.appendTooltip(stack, world, tooltip, tooltipContext);
        int i = 1;
        String str = stack.getItem().getTranslationKey().toLowerCase(Locale.ROOT).substring(19);
        String translationKey = String.format("tooltip_info_item.mcdw_redux.%s_", str);
        while (I18n.hasTranslation(translationKey + i)) {
            tooltip.add(Text.translatable(translationKey + i).formatted(Formatting.ITALIC));
            i++;
        }
    }
}
