package clothes;

public class Jacket extends ClothesItems {
    private String color;
    private String size;
    private String material;
    private JacketSleeves sleeves;
    private boolean buttons;
    private boolean zipper;

    public Jacket (String color, String size, String material, String sleevesLength, boolean sleevesButtons,
                   boolean buttons, boolean zipper, double price, String currency) {
        this.color = color;
        this.size = size;
        this.material = material;
        this.sleeves = new JacketSleeves(sleevesLength,sleevesButtons);
        this.buttons = buttons;
        this.zipper = zipper;
        this.price = price + price * 10;
        this.currency = currency;
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }

    public String getMaterial() {
        return material;
        }

    public boolean getButtons() {
        return buttons;
    }

    public boolean getZipper() {
        return zipper;
    }



}
