import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Declarations
        String politicalParty = "";


        // Create a scanner object
        Scanner in = new Scanner(System.in);


        // Prompt user input
        System.out.println("Enter your affiliated political party (R, D, or I):");

        //Accept input from user
        politicalParty = in.next();

        if (politicalParty.equals("R")) {
            System.out.println("You get a Republican Elephant.");
        } else if (politicalParty.equals("D")) {
            System.out.println("You get a Democratic Donkey.");
        } else if (politicalParty.equals("I")) {
            System.out.println("You get an Independent Man.");
        } else {
            System.out.println("You get Other: " + politicalParty + ".");
        }
    }
}