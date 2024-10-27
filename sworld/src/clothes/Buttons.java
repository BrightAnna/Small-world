package clothes;

import enums.ButtonColor;
import enums.ButtonMaterial;
import enums.ButtonSize;

public class Buttons {

    private ButtonSize buttonSize;
    private ButtonColor buttonColor;
    private ButtonMaterial buttonMaterial;
    boolean haveSleevesButtons;

    public Buttons(ButtonSize buttonSize, ButtonColor buttonColor, ButtonMaterial buttonMaterial,
                   boolean haveSleevesButtons) {
        this.buttonSize = buttonSize;
        this.buttonColor = buttonColor;
        this.buttonMaterial = buttonMaterial;
        this.haveSleevesButtons = haveSleevesButtons;
    }

    public Buttons (boolean haveSleevesButtons) {
        this.haveSleevesButtons = haveSleevesButtons;
    }

    public ButtonSize getButtonSize() {
        return buttonSize;
    }

    public ButtonColor getButtonColor() {
        return buttonColor;
    }

    public ButtonMaterial getButtonMaterial() {
        return buttonMaterial;
    }

    public boolean getHaveSleevesButtons() {
        return haveSleevesButtons;
    }
}
