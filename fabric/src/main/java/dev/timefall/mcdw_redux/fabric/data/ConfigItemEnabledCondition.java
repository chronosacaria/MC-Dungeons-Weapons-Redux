package dev.timefall.mcdw_redux.fabric.data;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import dev.timefall.mcdw_redux.McdwRedux;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceConditions;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.util.JsonHelper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConfigItemEnabledCondition {

    public static void register() {
        ResourceConditions.register(new Identifier(McdwRedux.MOD_ID, "config_enabled"), jsonObject -> {
            JsonArray jsonArray = JsonHelper.getArray(jsonObject, "values");
            List<Boolean> booleanArrayList = new ArrayList<>();

            for (JsonElement jsonElement : jsonArray) {
                if (jsonElement.isJsonPrimitive()) {
                    try {
                        String jsonElementString = jsonElement.getAsString();
                        List<String> configClasses = Arrays.stream(jsonElementString.split("\\.")).toList();
                        if (configClasses.size() > 1) {
                            booleanArrayList.add(
                                    McdwRedux.CONFIG.getClass().getField(configClasses.get(0))
                                            .get(McdwRedux.CONFIG).getClass().getField(configClasses.get(1))
                                            .getBoolean(McdwRedux.CONFIG.getClass().getField(configClasses.get(0))
                                                    .get(McdwRedux.CONFIG)));
                        } else
                            booleanArrayList.add(McdwRedux.CONFIG.getClass().getField(jsonElementString)
                                    .getBoolean(McdwRedux.CONFIG));
                    } catch (NoSuchFieldException | IllegalAccessException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
            return booleanArrayList.stream().allMatch(aBoolean -> aBoolean);
        });

        ResourceConditions.register(new Identifier(McdwRedux.MOD_ID, "item_enabled"), jsonObject -> {
            JsonArray jsonArray = JsonHelper.getArray(jsonObject, "values");

            for (JsonElement jsonElement : jsonArray) {
                if (jsonElement.isJsonPrimitive()) {
                    return Registries.ITEM.get(new Identifier(jsonElement.getAsString())) != Items.AIR;
                }
            }
            return true;
        });
    }
}