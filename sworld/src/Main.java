import clothes.Jacket;
import clothes.Shirt;

public class Main {

    public static void main(String[] args) {


        Shirt blackShirt = new Shirt("black", "XS", "cotton", "average","brown",
                "square", "wood", true, 14.50, "EUR");

        Jacket beigeJacket = new Jacket("beige","S","tweed", "long", false,
                false, true,28.90, "EUR");


        String shirtColor = blackShirt.getColor();
        System.out.println(shirtColor);



    }
}