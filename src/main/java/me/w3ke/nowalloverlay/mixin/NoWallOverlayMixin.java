package me.w3ke.nowalloverlay.mixin;

import net.minecraft.client.gui.hud.InGameOverlayRenderer;
import net.minecraft.client.texture.Sprite;
import net.minecraft.client.util.math.MatrixStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(InGameOverlayRenderer.class)
public class NoWallOverlayMixin {

    @Inject(
            method = "renderInWallOverlay",
            at = @At("HEAD"),
            cancellable = true
    )
    private static void onRenderInWallOverlay(
            Sprite sprite, MatrixStack matrices, CallbackInfo ci
    ) {
        ci.cancel();
    }

}
