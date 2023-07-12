package dev.timefall.mcdw_redux.items.bases;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import dev.timefall.mcdw_redux.enums.WeaponsID;
import dev.timefall.mcdw_redux.helpers.RegistrationHelper;
import dev.timefall.mcdw_redux.interfaces.IInnateEnchantment;
import dev.timefall.mcdw_redux.registries.ItemGroupsRegistry;
import net.minecraft.block.BlockState;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.List;
import java.util.Map;

/**
 * StaffBaseItem is an extension of AxeItem in order to make use of the shield breaking functionality of the AxeItem
 */

public class StaffBaseItem extends AxeItem implements IInnateEnchantment {
    WeaponsID weaponsID;
    private final Multimap<EntityAttribute, EntityAttributeModifier> attributeModifiers;
    private final double attackRange;
    String[] repairIngredient;

    @SuppressWarnings("UnstableApiUsage")

    public StaffBaseItem(WeaponsID weaponsID, ToolMaterial material, float attackDamage, float attackSpeed, double attackRange, String[] repairIngredient) {
        super(material, attackDamage, attackSpeed, new Item.Settings()
                .rarity(RegistrationHelper.mcdw_redux$fromToolMaterial(material))
                .arch$tab(ItemGroupsRegistry.MCDW_REDUX_MELEE));
        this.weaponsID = weaponsID;
        this.attackRange = attackRange;
        this.repairIngredient = repairIngredient;

        ImmutableMultimap.Builder<EntityAttribute, EntityAttributeModifier> builder = ImmutableMultimap.builder();
        RegistrationHelper.mcdw_redux$putRangeAttributes(builder, attackDamage, attackSpeed, attackRange);
        this.attributeModifiers = builder.build();
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        return ActionResult.PASS;
    }

    @Override
    public boolean canRepair(ItemStack stack, ItemStack ingredient) {
        return RegistrationHelper.mcdw_redux$canRepairCheck(repairIngredient, ingredient);
    }

    @Override
    public boolean canMine(BlockState state, World world, BlockPos pos, PlayerEntity miner) {
        return !miner.isCreative();
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        stack.damage(1, attacker, entity -> entity.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND));
        return true;
    }

    @Override
    public boolean postMine(ItemStack stack, World world, BlockState state, BlockPos pos, LivingEntity miner) {
        if (state.getHardness(world, pos) != 0.0F){
            stack.damage(2, miner, entity -> entity.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND));
        }

        return true;
    }

    @Override
    public Multimap<EntityAttribute, EntityAttributeModifier> getAttributeModifiers(EquipmentSlot equipmentSlot){
        return equipmentSlot == EquipmentSlot.MAINHAND ?
                RegistrationHelper.unionMaps(super.getAttributeModifiers(equipmentSlot), attributeModifiers) :
                super.getAttributeModifiers(equipmentSlot);
    }

    @Override
    public ItemStack getDefaultStack() {
        return mcdw_redux$getInnateEnchantedStack(this);
    }

    @Override
    public Map<Enchantment, Integer> mcdw_redux$getInnateEnchantments() {
        return null;
    }

    @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        super.appendTooltip(stack, world, tooltip, tooltipContext);
        RegistrationHelper.mcdw_redux$appendTooltip(this.weaponsID, tooltip);
    }
}
