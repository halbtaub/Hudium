package dev.intelligentcreations.hudium.api.hud;

import dev.intelligentcreations.hudium.util.Phys;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.entity.player.PlayerEntity;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;

public interface Component {
    void render(GuiGraphics guiGraphics, @NotNull PlayerEntity camera, float tickDelta, Phys.Position position);

    void renderDefault(GuiGraphics guiGraphics, float tickDelta, Phys.Position pos);

    Collection<Phys.Bounds> getBounds();

    ComponentType<?> getType();
}
