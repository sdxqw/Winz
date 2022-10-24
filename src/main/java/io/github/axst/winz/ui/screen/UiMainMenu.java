package io.github.axst.winz.ui.screen;

import io.github.axst.winz.ui.UiScreen;
import io.github.axst.winz.ui.component.CustomButton;
import net.minecraft.client.gui.GuiGameOver;

public class UiMainMenu extends UiScreen {

    private final CustomButton button = new CustomButton("Test");

    @Override
    public void drawElement(float mouseX, float mouseY) {
        button.setSize(10, 20, 30, 40);
    }

    @Override
    public void drawElementsOnScreen(float mouseX, float mouseY) {
        button.drawElement(mouseX, mouseY);
    }

    @Override
    public void elementsMouseClicked(float mouseX, float mouseY, int state) {
        if (state == 0 && button.mouseMove(mouseX, mouseY)) {
            this.mc.displayGuiScreen(new GuiGameOver());
        }
    }
}
