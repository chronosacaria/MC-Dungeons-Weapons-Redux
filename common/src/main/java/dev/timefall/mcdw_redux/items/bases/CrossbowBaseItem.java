package dev.timefall.mcdw_redux.items.bases;

import dev.architectury.platform.Platform;
import dev.timefall.mcdw_redux.enums.WeaponsID;
import dev.timefall.mcdw_redux.helpers.BasesHelper;
import dev.timefall.mcdw_redux.interfaces.IInnateEnchantment;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.CrossbowItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.minecraft.world.World;

import java.util.List;
import java.util.Map;

/**
 * CrossbowBaseItem is a replica of CrossbowItem except that it also has the functionality bestowed by this mod.
 * This functionality includes variable projectile damage, draw speed, range and allowing for innate enchantments.
 */

public class CrossbowBaseItem extends CrossbowItem implements IInnateEnchantment {
    WeaponsID weaponsID;
    public final ToolMaterial material;
    public final double projectileDamage;
    public final int drawSpeed;
    public final float range;
    String[] repairIngredient;

    public CrossbowBaseItem(WeaponsID weaponsID, ToolMaterial material, double projectileDamage, int drawSpeed, float range, String[] repairIngredient) {
        super(BasesHelper.mcdw_redux$createRangedWeaponSettings(material));
        this.weaponsID = weaponsID;
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
        return BasesHelper.mcdw_redux$canRepairCheck(repairIngredient, ingredient);
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
        BasesHelper.mcdw_redux$appendTooltip(this.weaponsID, tooltip);
    }
}
