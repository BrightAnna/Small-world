import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Shirt blackShirt = new Shirt("black","XS","cotton", 5.00, "EUR");

        Buttons brownButtons = new Buttons("small", "brown", "square", "wood");



        System.out.println("\nBlack Shirt\n" + "Color: " + blackShirt.getColor() + "\nSize: " + blackShirt.getSize() +
                "\nMaterial: " + blackShirt.getMaterial() + "\n\nButtons" + "\nSize: " + brownButtons.getSize() +
                "\nColor: " + brownButtons.getColor() + "\nShape: " + brownButtons.getShape() + "\nMaterial: "
                + brownButtons.getMaterial() + "\n\nPrise: " + blackShirt.priсe + " " + blackShirt.getCurrency());


    }
}