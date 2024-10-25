import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        System.out.println("Please enter your score");
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();

        while (score < 0 || score > 100) {
            System.out.println("The value is invalid. Please try again.");
            score = scanner.nextInt();
        }

        if (score >= 90) {
            System.out.println("Your great is A");
        } else if (score >= 80) {
            System.out.println("Your great is B");
        } else if (score >= 70) {
            System.out.println("Your great is C");
        } else if (score >= 60) {
            System.out.println("Your great is D");
        } else if (score >= 50) {
            System.out.println("Your great is E");
        } else System.out.println("Your great is F");

        System.out.println("Keep it up");


        whileOperator();
        sumOfNambers();
        remoteControl();

    }

    public static void whileOperator() {

        String userInput = "";
        Scanner scanner = new Scanner(System.in);

        while (!userInput.equals("Exit")) {
            System.out.println("Please enter something");
            userInput = scanner.nextLine();
            System.out.println("Great!");

        }
        System.out.println("You are lucky guy! Goodbye");

    }

    public static void sumOfNambers(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");

        int userInput = scanner.nextInt();
        int sum = 0;

        for(int i = 0; i <= userInput; i++) {
            sum += i;
        }


        for(int i = 0; i >= userInput; i--) {
            sum += i;
        }
        System.out.printf("Sum of numbers from 0 to %d is %d\n", userInput, sum);
        System.out.println("Thanks. Bye");

    }

    public static void remoteControl() {

        String[] tvChannels = new String[6];
        tvChannels[0] = "TV1000";
        tvChannels[1] = "TV1000Action";
        tvChannels[2] = "Sony Sci-fi";
        tvChannels[3] = "FOX";
        tvChannels[4] = "MuzTV";
        tvChannels[5] = "DiscoveryTV";

        System.out.println("Please choose a channel");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();

        while (userInput != 0){

            if (userInput > tvChannels.length) {
                System.out.println("Wrong channel");
            } else {
                System.out.println(tvChannels[userInput - 1]);
            }

            System.out.println("Please choose a channel");
            userInput = scanner.nextInt();

            System.out.println("Exit");


        }

    }
}
