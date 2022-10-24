package io.github.axst.winz.mixins;

import io.github.axst.winz.Winz;
import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Minecraft.class)
public class MinecraftMixins {

    @Inject(method = "startGame", at = @At("RETURN"))
    public void injectStartGame(CallbackInfo ci) {
        Winz.getInstance().start();
    }

    @Inject(method = "shutdownMinecraftApplet", at = @At("HEAD"))
    public void injectStopGame(CallbackInfo ci) {
        Winz.getInstance().stop();
    }
}
