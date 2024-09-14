// 4 sep 2024 Jonas N Lesson-2 Multiplication Table

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner for user input
        Scanner sc = new Scanner(System.in);
        String again = "y";

        do {
            System.out.println("Välj en multiplikationstabell (ange ett heltal): ");

            // Check if the input is an integer
            while (!sc.hasNextInt()) {
                System.out.println("Ogiltig inmatning! Ange ett giltigt heltal:");
                sc.next();  // Loads and ignores incorrect input
            }

            int chosenNumber = sc.nextInt();
            sc.nextLine();  // Remove

            // Display the multiplication table for the selected number
            for (int i = 0; i <= 10; i++) {
                int answer = i * chosenNumber;
                System.out.println(i + " * " + chosenNumber + " = " + answer);
            }

            // Ask if the user wants to continue
            System.out.println("Vill du se en tabell till? (y/n)");
            again = sc.nextLine().toLowerCase();

            // Check that the user only types 'y' or 'n'
            while (!again.equals("y") && !again.equals("n")) {
                System.out.println("Ogiltig inmatning! Skriv 'y' för ja eller 'n' för nej:");
                again = sc.nextLine().toLowerCase();
            }

        } while (again.equals("y"));

        sc.close();
        System.out.println("END,Tack för att du använde programmet!");
    }
}