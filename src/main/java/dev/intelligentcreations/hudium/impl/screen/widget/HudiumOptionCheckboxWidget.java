package dev.intelligentcreations.hudium.impl.screen.widget;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.widget.CheckboxWidget;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;

public class HudiumOptionCheckboxWidget extends CheckboxWidget{
    private static final Identifier TEXTURE = new Identifier("textures/gui/checkbox.png");
    private boolean checked;
    private boolean showMessage;
    public HudiumOptionCheckboxWidget(int x, int y, int width, int height, Text text, boolean checked, boolean showMessage) {
        super(x, y, width, height, text, checked, showMessage);
        this.checked = checked;
        this.showMessage = showMessage;
    }

    @Override
    public void onPress() {
        this.checked = !this.checked;
    }

    @Override
    public void drawWidget(GuiGraphics graphics, int mouseX, int mouseY, float delta) {
        MinecraftClient lv = MinecraftClient.getInstance();
        RenderSystem.enableDepthTest();
        TextRenderer lv2 = lv.textRenderer;
        graphics.setShaderColor(1.0F, 1.0F, 1.0F, this.alpha);
        RenderSystem.enableBlend();
        graphics.drawTexture(TEXTURE, this.getX(), this.getY(), this.isFocused() ? 20.0F : 0.0F, this.checked ? 20.0F : 0.0F, 20, this.height, 64, 64);
        graphics.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        if (this.showMessage) {
            graphics.drawShadowedText(lv2, this.getMessage(), this.getX() + 24, this.getY() + (this.height - 8) / 2, 14737632 | MathHelper.ceil(this.alpha * 255.0F) << 24);
        }

    }
}
