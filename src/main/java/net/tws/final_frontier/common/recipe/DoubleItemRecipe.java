package net.tws.final_frontier.common.recipe;

import com.mojang.datafixers.Products;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemStackTemplate;
import net.minecraft.world.item.crafting.*;
import org.jspecify.annotations.Nullable;

import java.util.Objects;
import java.util.function.Function;
import java.util.logging.Level;

public abstract class DoubleItemRecipe implements Recipe<DoubleRecipeInput> {
    protected final Recipe.CommonInfo commonInfo;
    private final Ingredient input1;
    private final Ingredient input2;
    private final ItemStackTemplate result;
    private @Nullable PlacementInfo placementInfo;

    public DoubleItemRecipe(final Recipe.CommonInfo commonInfo, final Ingredient input1, final Ingredient input2, ItemStackTemplate output) {
        this.commonInfo = commonInfo;
        this.input1 = input1;
        this.input2 = input2;
        this.result = output;
    }

    public abstract RecipeSerializer<? extends DoubleItemRecipe> getSerializer();

    public abstract RecipeType<? extends DoubleItemRecipe> getType();

    public boolean matches(final  DoubleRecipeInput input1, final DoubleRecipeInput input2, final Level level) {
        return this.input1.test(input1.item1()) && this.input2.test(input2.item2());
    }

    public boolean showNotification() {
        return this.commonInfo.showNotification();
    }

    public Ingredient input1(){
        return  this.input1;
    }

    public Ingredient input2(){
        return  this.input2;
    }

    protected ItemStackTemplate output(){
        return this.result;
    }

    public PlacementInfo placementInfo(){
        if (this.placementInfo == null) {
            this.placementInfo = PlacementInfo.create(this.input1);
            this.placementInfo = PlacementInfo.create(this.input2);
        }

        return  this.placementInfo;
    }

    public ItemStack assemble(final DoubleRecipeInput input1, final DoubleRecipeInput input2){
        return this.result.create();
    }

    public static <T extends DoubleItemRecipe> MapCodec<T> simpleMapCodec(final Factory<T> factory) {
        return RecordCodecBuilder.mapCodec((i) -> {
            Products.P4 products = i.group(CommonInfo.MAP_CODEC.forGetter(o -> o.commonInfo), Ingredient.CODEC.fieldOf("ingredient1").forGetter(DoubleItemRecipe::input1), Ingredient.CODEC.fieldOf("ingredient2").forGetter(DoubleItemRecipe::input2), ItemStackTemplate.CODEC.fieldOf("result").forGetter(DoubleItemRecipe::output));
            Objects.requireNonNull(factory);
            return products.apply(i, factory::create);
        });
    }

    public static <T extends DoubleItemRecipe> StreamCodec<RegistryFriendlyByteBuf, T> simpleStreamCodec(final DoubleItemRecipe.Factory<T> factory) {
        StreamCodec streamCodec = CommonInfo.STREAM_CODEC;
        Function commonInformation = (o) -> o.commonInfo;
        StreamCodec streamCodecContent = Ingredient.CONTENTS_STREAM_CODEC;
        Function recipeInput1 = DoubleItemRecipe::input1;
        Function recipeInput2 = DoubleItemRecipe::input2;
        StreamCodec itemTemplate = ItemStackTemplate.STREAM_CODEC;
        Function outputItem = DoubleItemRecipe::output;
        Objects.requireNonNull(factory);
        return StreamCodec.composite(streamCodec, commonInformation, streamCodecContent, recipeInput1, recipeInput2, itemTemplate, outputItem, factory::create);
    }

    @FunctionalInterface
    public interface Factory<T extends DoubleItemRecipe> {
        T create(Recipe.CommonInfo commonInfo, Ingredient input1, Ingredient input2, ItemStackTemplate output, PlacementInfo placementInfo);
    }
}
