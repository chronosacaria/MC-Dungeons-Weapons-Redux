package dev.timefall.mcdw_redux.interfaces;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import org.jetbrains.annotations.NotNull;

import java.util.Map;

public interface IInnateEnchantment {
    /**
     * Copyright 2023 DaFuqs
     * <br/><br/>
     * Used with Permission
     * <br/><br/>
     * The following code is from Spectrum and can be found here:<br/>
     * <a href = "https://github.com/DaFuqs/Spectrum/blob/1.19-deeper-down/src/main/java/de/dafuqs/spectrum/items/Preenchanted.java#L11">Preenchanted#getDefaultEnchantments</a>
     */

    Map<Enchantment, Integer> mcdw_redux$getInnateEnchantments();

    /**
     * Copyright 2023 DaFuqs
     * <br/><br/>
     * Used with Permission, modifications made to allow for checking whether innate enchantments are enabled or not.
     * <br/><br/>
     * The following code is from Spectrum and can be found here:<br/>
     * <a href = "https://github.com/DaFuqs/Spectrum/blob/1.19-deeper-down/src/main/java/de/dafuqs/spectrum/items/Preenchanted.java#L13">Preenchanted#getDefaultEnchantedStack</a>
     */
    default @NotNull ItemStack mcdw_redux$getInnateEnchantedStack(Item item) {
        ItemStack itemStack = new ItemStack(item);
        //if (McdwRedux.CONFIG.mcdwReduxEnchantmentSettingsConfig.ENABLE_ENCHANTMENT_SETTINGS.get(SettingsID.ENABLE_INNATE_ENCHANTMENTS)) {
            Map<Enchantment, Integer> map = mcdw_redux$getInnateEnchantments();
            if (map != null) {
                //if (McdwRedux.CONFIG.mcdwReduxEnchantmentSettingsConfig.ENABLE_ENCHANTMENT_SETTINGS.get(SettingsID.ENABLE_INNATE_ENCHANTMENTS))
                    for (Enchantment enchantment : map.keySet())
                        itemStack.addEnchantment(enchantment, map.get(enchantment));
            }
        //}
        return itemStack;
    }

    /**
     * Checks a stack if it only has enchantments that are lower or equal its InnateEnchantments,
     * meaning enchantments had been added on top of the innate ones.
     *
     * Copyright 2023 DaFuqs
     * <br/><br/>
     * Used with Permission, modifications made to allow for checking whether innate enchantments are enabled or not.
     * <br/><br/>
     * The following code is from Spectrum and can be found here:<br/>
     * <a href = "https://github.com/DaFuqs/Spectrum/blob/1.19-deeper-down/src/main/java/de/dafuqs/spectrum/items/Preenchanted.java#L13">Preenchanted#onlyHasPreEnchantments</a>
     */
    default boolean mcdw_redux$onlyHasInnateEnchantments(ItemStack stack) {
        Map<Enchantment, Integer> innateEnchantments = mcdw_redux$getInnateEnchantments();
        Map<Enchantment, Integer> stackEnchantments = EnchantmentHelper.get(stack);

        for(Map.Entry<Enchantment, Integer> stackEnchantment : stackEnchantments.entrySet()) {
            int innateLevel = innateEnchantments.getOrDefault(stackEnchantment.getKey(), 0);
            if(stackEnchantment.getValue() > innateLevel) {
                return false;
            }
        }

        return true;
    }
}
