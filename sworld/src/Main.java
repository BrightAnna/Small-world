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
                FileUtils.readFromFile();
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

}
