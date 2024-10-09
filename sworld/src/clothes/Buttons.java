package clothes;

public class Buttons {

    private String buttonSize;
    private String buttonColor;
    private String buttonShape;
    private String buttonMaterial;
    boolean haveSleevesButtons;

    public Buttons(String buttonSize, String buttonColor, String buttonShape, String buttonMaterial,
                   boolean haveSleevesButtons){
        this.buttonSize = buttonSize;
        this.buttonColor = buttonColor;
        this.buttonShape = buttonShape;
        this.buttonMaterial = buttonMaterial;
        this.haveSleevesButtons = haveSleevesButtons;
    }

    public String getButtonSize() {
        return buttonSize;
    }

    public String getButtonColor() {
        return buttonColor;
    }

    public String getButtonShape() {
        return buttonShape;
    }

    public String getButtonMaterial() {
        return buttonMaterial;
    }

    public Boolean getHaveSleevesButtons() {
        return haveSleevesButtons;
    }
}
