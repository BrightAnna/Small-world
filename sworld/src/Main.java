import clothes.Jacket;
import clothes.Shirt;
import enums.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Shirt blackShirt = new Shirt(ShirtColor.BLACK, ShirtSize.XS, ShirtMaterial.COTTON, ButtonSize.AVERAGE,
                ButtonColor.BROWN, ButtonMaterial.WOODS, true,
                14.50, "EUR");

        Jacket beigeJacket = new Jacket(JacketColor.BEIGE, JacketSize.S, JacketMaterial.TWEED, JacketSleevesLength.LONG,
                false, false, true, 28.90, "EUR");


        System.out.println("Please choose one of the option: \n0 - Exit \n1 - Create my shirt \n2 - Show my shirt\n");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();

        while (userInput != 0) {
            if (userInput > 2) {
                System.out.println("Wrong option. Try again");
            } else if (userInput == 2) {
                readFromFile();
            } else if (userInput == 1) {
                writeToFile();
            }

            System.out.println("Please choose one of the option: \n0 - Exit \n1 - Create my shirt \n2 - Show my shirt\n");
            userInput = scanner.nextInt();
        }

        System.out.println("Thanks for coming. Bye");

    }

    public static void writeToFile() {
        try {

            FileWriter userFile = new FileWriter("C:\\Users\\AnastasiaBabanskay\\ufile.txt");

            shirtColor();
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            userFile.write(input + "\n");

            shirtSize();
            input = scanner.nextLine();
            userFile.write(input + "\n");

            shirtMaterial();
            input = scanner.nextLine();
            userFile.write(input + "\n");

            buttonSize();
            input = scanner.nextLine();
            userFile.write(input + "\n");

            buttonColor();
            input = scanner.nextLine();
            userFile.write(input + "\n");

            buttonMaterial();
            input = scanner.nextLine();
            userFile.write(input + "\n");

            TwoButtonsOnSleeves();
            input = scanner.nextLine();
            userFile.write(input + "\n");

            userFile.close();

        } catch (IOException e) {
            System.out.println("Sorry, cannot write to file. Write something else");

        }
    }

    public static void readFromFile() {
        try {
            File userfile = new File("C:\\Users\\AnastasiaBabanskay\\ufile.txt");
            Scanner filescanner = new Scanner(userfile);
            ArrayList<String> dataFromFile = new ArrayList<>();


            while (filescanner.hasNextLine()) {
                dataFromFile.add(filescanner.nextLine());
            }

            System.out.println("My shirt" + "\nShirt color: " + dataFromFile.get(0) + "\nShirt size: " + dataFromFile.get(1) +
                    "\nShirt material: " + dataFromFile.get(2) + "\nButton size: " + dataFromFile.get(3) +
                    "\nButton color: " + dataFromFile.get(4) + "\nButton material: " + dataFromFile.get(5) +
                    "\nSleeves have buttons: " + dataFromFile.get(6));

            System.out.println("=============================");


        } catch (FileNotFoundException e) {
            System.out.println("Sorry, file doesn't exist. Create a file first");

        }

    }

    public static void shirtColor() {
        System.out.println("Choose the shirt color:");
        for (ShirtColor shirtColor : ShirtColor.values()) {
            System.out.println(shirtColor);
        }

    }

    public static void shirtSize() {
        System.out.println("Choose the shirt size:");
        for (ShirtSize shirtsize : ShirtSize.values()) {
            System.out.println(shirtsize);
        }

    }

    public static void shirtMaterial() {
        System.out.println("Choose the shirt material:");
        for (ShirtMaterial shirtMaterial : ShirtMaterial.values()) {
            System.out.println(shirtMaterial);
        }

    }

    public static void buttonSize() {
        System.out.println("Choose the buttons size:");
        for (ButtonSize buttonSize : ButtonSize.values()) {
            System.out.println(buttonSize);
        }

    }

    public static void buttonColor() {
        System.out.println("Choose the buttons color:");
        for (ButtonColor buttonColor : ButtonColor.values()) {
            System.out.println(buttonColor);
        }

    }

    public static void buttonMaterial() {
        System.out.println("Choose the buttons material:");
        for (ButtonMaterial buttonColor : ButtonMaterial.values()) {
            System.out.println(buttonColor);
        }

    }

    public static void TwoButtonsOnSleeves() {
        System.out.println("Do sleeves have buttons? \nWrite: YES or NO");

    }


}
