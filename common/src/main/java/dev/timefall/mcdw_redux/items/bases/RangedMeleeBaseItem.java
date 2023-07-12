package dev.timefall.mcdw_redux.items.bases;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.LinkedListMultimap;
import com.google.common.collect.Multimap;
import dev.timefall.mcdw_redux.enums.WeaponsID;
import dev.timefall.mcdw_redux.helpers.RegistrationHelper;
import dev.timefall.mcdw_redux.interfaces.IInnateEnchantment;
import dev.timefall.mcdw_redux.registries.ItemGroupsRegistry;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.item.Item;
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

    @SuppressWarnings("UnstableApiUsage")

    public RangedMeleeBaseItem(WeaponsID weaponsID, ToolMaterial material, int attackDamage, float attackSpeed, double attackRange, String[] repairIngredient) {
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
        return RegistrationHelper.mcdw_redux$canRepairCheck(repairIngredient, ingredient);
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
