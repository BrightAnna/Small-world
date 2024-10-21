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
            } else if (userInput < 0) {
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

            FileUtils.shirtColor();
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            userFile.write(input + "\n");

            FileUtils.shirtSize();
            input = scanner.nextLine();
            userFile.write(input + "\n");

            FileUtils.shirtMaterial();
            input = scanner.nextLine();
            userFile.write(input + "\n");

            FileUtils.buttonSize();
            input = scanner.nextLine();
            userFile.write(input + "\n");

            FileUtils.buttonColor();
            input = scanner.nextLine();
            userFile.write(input + "\n");

            FileUtils.buttonMaterial();
            input = scanner.nextLine();
            userFile.write(input + "\n");

            FileUtils.twoButtonsOnSleeves();
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
