package clothes;

import enums.*;

public class Shirt extends ClothesItems {

    private ShirtColor color;
    private ShirtSize size;
    private ShirtMaterial material;
    private Buttons buttons;


    public Shirt(ShirtColor color, ShirtSize size, ShirtMaterial material, ButtonSize buttonSize, ButtonColor buttonColor,
                 ButtonMaterial buttonMaterial, boolean haveSleevesButtons, double price, String currency) {
        this.color = color;
        this.size = size;
        this.material = material;
        this.buttons = new Buttons(buttonSize, buttonColor, buttonMaterial, haveSleevesButtons);
        this.price = price;
        this.currency = currency;

    }

    public ShirtColor getColor() {

        return color;
    }

    public ShirtSize getSize() {
        return size;
    }

    public ShirtMaterial getMaterial() {
        return material;
    }


}
