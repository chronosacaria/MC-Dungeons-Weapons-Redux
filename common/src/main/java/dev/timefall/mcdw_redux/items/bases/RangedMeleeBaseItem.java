package dev.timefall.mcdw_redux.items.bases;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.LinkedListMultimap;
import com.google.common.collect.Multimap;
import dev.timefall.mcdw_redux.enums.WeaponsID;
import dev.timefall.mcdw_redux.helpers.BasesHelper;
import dev.timefall.mcdw_redux.interfaces.IInnateEnchantment;
import dev.timefall.mcdw_redux.registries.ItemGroupsRegistry;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.minecraft.world.World;

import java.util.List;
import java.util.Map;

public class RangedMeleeBaseItem extends SwordItem implements IInnateEnchantment {
    WeaponsID weaponsID;
    private final Multimap<EntityAttribute, EntityAttributeModifier> attributeModifiers;
    private final double attackRange;
    String[] repairIngredient;

    public RangedMeleeBaseItem(WeaponsID weaponsID, ToolMaterial material, int attackDamage, float attackSpeed, double attackRange, String[] repairIngredient) {
        super(material, attackDamage, attackSpeed, BasesHelper.mcdw_redux$createMeleeWeaponSettings(material, ItemGroupsRegistry.MCDW_REDUX_MELEE.get()));
        this.weaponsID = weaponsID;
        this.attackRange = attackRange;
        this.repairIngredient = repairIngredient;

        ImmutableMultimap.Builder<EntityAttribute, EntityAttributeModifier> builder = ImmutableMultimap.builder();
        BasesHelper.mcdw_redux$putRangeAttributes(builder, attackRange);
        this.attributeModifiers = builder.build();
    }

    public double getAttackRange() {
        return attackRange;
    }

    @Override
    public Multimap<EntityAttribute, EntityAttributeModifier> getAttributeModifiers(EquipmentSlot equipmentSlot){
        LinkedListMultimap<EntityAttribute, EntityAttributeModifier> combinedMultiMap = LinkedListMultimap.create();
        combinedMultiMap.putAll(super.getAttributeModifiers(equipmentSlot));
        combinedMultiMap.putAll(attributeModifiers);
        return equipmentSlot == EquipmentSlot.MAINHAND ? combinedMultiMap :
                super.getAttributeModifiers(equipmentSlot);
    }

    @Override
    public boolean canRepair(ItemStack stack, ItemStack ingredient) {
        return BasesHelper.mcdw_redux$canRepairCheck(repairIngredient, ingredient);
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
