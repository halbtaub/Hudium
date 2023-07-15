package dev.intelligentcreations.hudium.impl.screen;

import dev.intelligentcreations.hudium.impl.screen.widget.HudiumOptionCheckboxWidget;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.TextWidget;
import net.minecraft.text.Text;

public final class GeneralConfigScreen extends AbstractConfigScreen {
    static final Text TITLE = Text.translatable("config.hudium.hudium-config.general");

    GeneralConfigScreen(Screen parent) {
        super(TITLE, parent);
    }

    @Override
    protected void init() {
        super.init();
        int titleWidth = textRenderer.getWidth(TITLE);
        addDrawable(new TextWidget(
                ((width - titleWidth) / 2),
                 20,
                titleWidth,
                textRenderer.fontHeight,
                TITLE,
                textRenderer)
        );
        addDrawable(new HudiumOptionCheckboxWidget(
                (width / 2),
                (height / 2),
                100,
                20,
                Text.translatable("configEntry.hudium-config.displayHealthValue"),
                true,
                true
        ));
    }
}
