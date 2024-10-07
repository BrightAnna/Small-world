
public class Shirt {

    private String color;
    private String size;
    private String material;
    double priсe;
    private String currency;

    Buttons buttons;

    public Shirt (String color, String size, String material, double priсe, String currency) {
        this.color = color;
        this.size = size;
        this.material = material;
        this.priсe = priсe + priсe * 10;
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

    public String getCurrency() {
        return currency;
    }



}
