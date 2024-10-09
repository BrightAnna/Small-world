package clothes;

public class Shirt extends ClothesItems {

    private String color;
    private String size;
    private String material;
    private Buttons buttons;



    public Shirt (String color, String size, String material, String buttonSize, String buttonColor, String buttonShape,
                  String buttonMaterial, boolean haveSleevesButtons, double price, String currency) {
        this.color = color;
        this.size = size;
        this.material = material;
        this.buttons = new Buttons(buttonSize, buttonColor, buttonShape, buttonMaterial, haveSleevesButtons);
        this.price = price + price * 10;
        this.currency = currency;

    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }

    public String getSize() {
        return size;
    }



}
