import java.util.Scanner;

public class Task2 {
    public static void main (String[] args) {
        String myName = "Nastya";
        String mySurname = "Babanskaya";
        String myNationality = "BY";
        String myCat = "";
        String myString = "Buna ziua";

        String infoaboutme = String.format("\nMy name: %s\nMy Surname: %s\nMy Nationality: %s\n",
                myName, mySurname, myNationality);

        byte month = 9;
        short phoneCode = 375;
        int year = 2024;
        int nextyear = 2025;
        long customerID = 60002080;
        float floatNr = 7.8f;
        double doubleNr = 7.4;
        boolean checkYear = year == nextyear;
        char charNr = 'Y';

        System.out.print("Please enter something: ");

        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        String anotherName = "Nasta";

        StringBuffer buffer = new StringBuffer("\nMy anotherName: ");
        buffer.append(anotherName);


        System.out.println(infoaboutme);
        System.out.println(month);
        System.out.println(phoneCode);
        System.out.println(year);
        System.out.println(customerID);
        System.out.println(floatNr);
        System.out.println(doubleNr);
        System.out.println(checkYear);
        System.out.println(charNr);


        System.out.println(myName.length());
        System.out.println(myCat.isEmpty());
        System.out.println(myName.charAt(3));
        System.out.println(myName.equals(anotherName));
        System.out.println(myName.equalsIgnoreCase(anotherName));
        System.out.println(myName.startsWith("Nas"));
        System.out.println(myName.endsWith("ta"));
        System.out.println(myString.contains("Buna"));
        System.out.println(myNationality.replace('Y','y'));
        System.out.println(myCat.replace("","Сami"));
        System.out.println(myNationality.toLowerCase());
        System.out.println(buffer);
    }
}
