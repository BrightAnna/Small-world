import enums.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileUtils {

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

            twoButtonsOnSleeves();
            input = scanner.nextLine();
            userFile.write(input + "\n");

            userFile.close();

        } catch (IOException e) {
            System.out.println("Sorry, cannot write to file. Write something else");

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

    public static void twoButtonsOnSleeves() {
        System.out.println("Do sleeves have buttons? \nWrite: YES or NO");

    }

    public static void readFromFile() {
        try {
            File userfile = new File("C:\\Users\\AnastasiaBabanskay\\ufile.txt");
            Scanner filescanner = new Scanner(userfile);
            ArrayList<String> dataFromFile = new ArrayList<>();


            while (filescanner.hasNextLine()) {
                dataFromFile.add(filescanner.nextLine());
            }

            String myShirt = String.format("\nShirt color: %s \nShirt size: %s \nShirt material: %s" +
                            "\nButton size: %s \nButton color: %s\nButton material: %s \nSleeves have buttons: %s",
                    dataFromFile.get(0), dataFromFile.get(1), dataFromFile.get(2), dataFromFile.get(3), dataFromFile.get(4),
                    dataFromFile.get(5), dataFromFile.get(6));

            System.out.println("My shirt" + myShirt);

            System.out.println("=============================");

        } catch (FileNotFoundException e) {
            System.out.println("Sorry, file doesn't exist. Create a file first");

        }

    }

}
