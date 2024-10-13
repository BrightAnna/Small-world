package clothes;

import enums.JacketColor;
import enums.JacketMaterial;
import enums.JacketSize;
import enums.JacketSleevesLength;

public class Jacket extends ClothesItems {
    private JacketColor color;
    private JacketSize size;
    private JacketMaterial material;
    private JacketSleeves sleeves;
    private boolean buttons;
    private boolean zipper;

    public Jacket(JacketColor color, JacketSize size, JacketMaterial material, JacketSleevesLength sleevesLength,
                  boolean sleevesButtons, boolean buttons, boolean zipper, double price, String currency) {
        this.color = color;
        this.size = size;
        this.material = material;
        this.sleeves = new JacketSleeves(sleevesLength, sleevesButtons);
        this.buttons = buttons;
        this.zipper = zipper;
        this.price = price;
        this.currency = currency;
    }

    public JacketColor getColor() {
        return color;
    }

    public JacketSize getSize() {
        return size;
    }

    public JacketMaterial getMaterial() {
        return material;
    }

    public boolean getButtons() {
        return buttons;
    }

    public boolean getZipper() {
        return zipper;
    }


}
