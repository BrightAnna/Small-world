import enums.*;

public class FileUtils {

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
}
