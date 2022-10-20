package Week1;

import helpers.InputReader;

import java.util.Calendar;

public class Week2 {
    /**
     * Task 1: Write a program that allows a user to type in their age. The program should then work out which year they were born and output this to the screen.
     * Outputs a message if the user is 18 or older.
     */
    static void taskCalculateBirthYear() {
        // Get the user's age
        int age = InputReader.getInt("Enter your age: ");

        // Get the current date
        Calendar calendar = Calendar.getInstance();

        // Calculate the user's birth year
        int birthYear = calendar.get(Calendar.YEAR) - age;

        // Print the user's birth year
        System.out.println("You were born in " + birthYear);

        // Print a message if the user is 18 or older
        if (age >= 18) {
            System.out.println("You are 18 or older.");
        }
    }

    /**
     * Task 2: Write a program that enables a student to enter a letter grade (A, B, C, D, E or F), then convert that to a university undergraduate classification (1st, 2:1, 2:2, 3rd, ordinary, fail).
     */
    static void taskConvertLetterGrade() {
        // Get the user's letter grade
        String letterGrade = InputReader.getString("Enter your letter grade: ");

        // Convert the letter grade to a classification (converting to uppercase to make the comparison case-insensitive)
        String classification = switch (letterGrade.toUpperCase()) {
            case "A" -> "1st";
            case "B" -> "2:1";
            case "C" -> "2:2";
            case "D" -> "3rd";
            case "E" -> "Ordinary";
            case "F" -> "Fail";
            default -> "Invalid grade";
        };

        // Print the classification
        System.out.println("Your classification is " + classification);
    }

    /**
     * Task 3: Output the digits between the range of 0 to 9 using a loop.
     */
    static void taskOutputDigitLoop() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

    /**
     * Task 4: Write a program that uses a loop to efficiently print the "seven times multiplication table".
     */
    static void taskSevenTimesTable() {
        for (int i = 1; i <= 12; i++) {
            System.out.println(i + " x 7 = " + (i * 7));
        }
    }

    /**
     * Task 5: Write a program that uses a loop to efficiently print a user-defined multiplication table.
     */
    static void taskUserDefinedTimesTable() {
        // Get the number to multiply by
        int number = InputReader.getInt("Enter a number to multiply by: ");

        // Print the times table
        for (int i = 1; i <= 12; i++) {
            System.out.println(i + " x " + number + " = " + (i * number));
        }
    }

    /**
     * Task 6: Write a program that uses a loop to efficiently print a user-defined multiplication table, and asks
     * the user if they want to continue.
     */
    static void taskUserDefinedTimesTableExtended() {
        // Create a variable to store whether the user wants to continue
        boolean continueLoop = true;

        // Create a loop that will continue until the user does not want to continue
        do {
            // Get the number to multiply by
            int number = InputReader.getInt("Enter a number to multiply by: ");

            // Print the times table
            for (int i = 1; i <= 12; i++) {
                System.out.println(i + " x " + number + " = " + (i * number));
            }

            // Ask the user if they want to continue
            continueLoop = InputReader.getString("Do you want to continue? (y/n): ").equalsIgnoreCase("y");
        } while (continueLoop);

        // Print a goodbye message
        System.out.println("Goodbye!");
    }

    /**
     * Task 7: Write a new program that asks the user to enter an exam mark (0-100).
     * Write conditional statements to print out the grade they would achieve from this mark.
     */
    static void taskCalculateGrade() {
        // Get the user's exam mark
        int mark = InputReader.getInt("Enter your exam mark: ");
        String grade;

        // Calculate the grade
        if (mark >= 80)
            grade = "A+";
        else if (mark >= 70)
            grade = "A";
        else if (mark >= 60)
            grade = "B";
        else if (mark >= 50)
            grade = "C";
        else if (mark >= 40)
            grade = "D";
        else if (mark >= 35)
            grade = "E";
        else
            grade = "F";

        // Print the grade
        System.out.println("Your grade is " + grade);
    }

    /**
     * Task 8: Write a program that will print only even numbers from a loop that repeats 10 times.
     */
    static void taskPrintEvenNumbers() {
        for (int i = 0; i < 10; i++) {
            // Check if the number is even using the modulus operator
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
