package dev.intelligentcreations.hudium.impl.screen;

import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.Text;

public abstract class AbstractConfigScreen extends Screen {
    protected final Screen parent;

    protected AbstractConfigScreen(Text title, Screen parent) {
        super(title);
        this.parent = parent;
    }

    @Override
    public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float delta) {
        renderConfigBackground(guiGraphics, mouseX, mouseY, delta);
        super.render(guiGraphics, mouseX, mouseY, delta);
    }

    @SuppressWarnings("unused")
    protected void renderConfigBackground(GuiGraphics guiGraphics, int mouseX, int mouseY, float delta) {
        guiGraphics.fill(0, 0, width, height, 0xff303030);
    }
}
