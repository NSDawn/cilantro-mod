package dev.nsdawn.cilantromod.mixin;

import net.minecraft.block.Block;
import net.minecraft.block.ComposterBlock;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin (ComposterBlock.class)
public abstract class ComposterBlockMixin extends Block {
    public ComposterBlockMixin(Settings settings) {
        super(settings);
    }

    @Inject(at = @At("TAIL"), method = "registerDefaultCompostableItems()V")
    private void registerDefaultCompostableItems(CallbackInfo ci) {
        //TODO: add as compostable:
        // Cilantro: 0.65F
        // Coriander Seeds: 0.3F
    }

}
