package io.github.axst.winz.ui.component;

import io.github.axst.winz.ui.UiElement;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class CustomButton extends UiElement {
    private String text;

    @Override
    public void drawElement(float mouseX, float mouseY) {
        this.mc.fontRendererObj.drawString(this.getText(), (int) (this.getX() + this.getWidth() / 2 - (this.mc.fontRendererObj.getStringWidth(this.text) / 2)), (int) (this.getY() + 4), 0);
    }
}
