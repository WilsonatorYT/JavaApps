package Week1;

import helpers.InputReader;

import java.util.Calendar;

public class Main {
    /*For this week's exercise, I have sorted the individual tasks into methods, rather than
    completely overwriting the main method.*/
    public static void main(String[] args) {
        taskCalculateDaysOld();
    }

    /**
     * Task 1: Write a program that simply outputs 'Hello World' to the console.
     */
    static void taskHelloWorld() {
        System.out.println("Hello World");
    }

    /**
     * Task 2: Write a program that asks the user for their name and then outputs 'Hello [name]' to the console.
     */
    static void taskHelloName() {
        // Get the name of the user
        System.out.println("What is your name?");
        String name = InputReader.getString("");

        // Print a message saying hello to the user
        System.out.println("Hello " + name);
    }

    /**
     * Task 3: Write a program that asks the user to enter values for the length and height of a
     * rectangle and then outputs the perimeter and area of the rectangle to the screen.
     */
    static void taskOutputRectangle() {
        // Get the length and height of the rectangle
        int length = InputReader.getInt("Enter the length of the rectangle: ");
        int height = InputReader.getInt("Enter the height of the rectangle: ");

        // Calculate the perimeter and area of the rectangle
        int perimeter = (length * 2) + (height * 2);
        int area = length * height;

        // Print the perimeter and area of the rectangle
        System.out.println("The perimeter of the rectangle is " + perimeter);
        System.out.println("The area of the rectangle is " + area);
    }

    /**
     * Task 4: Write a program that calculates and displays the average of two numbers entered. Check this program works for whole and decimal values.
     */
    static void taskAverage() {
        // Get the two numbers to average (using doubles to allow for decimal values)
        double num1 = InputReader.getDouble("Enter the first number: ");
        double num2 = InputReader.getDouble("Enter the second number: ");

        // Calculate the average of the two numbers
        double average = (num1 + num2) / 2;

        // Print the average of the two numbers
        System.out.println("The average of the two numbers is " + average);
    }

    /**
     * Task 5: Write a program that allows the user to enter two integer values.
     * The program should then output the original order they were entered, then output the values in reverse order (swapped).
     */
    static void taskSwap() {
        // Get the two numbers to swap
        int num1 = InputReader.getInt("Enter the first number: ");
        int num2 = InputReader.getInt("Enter the second number: ");

        // Print the original order of the numbers
        System.out.println("The original order of the numbers is " + num1 + " and " + num2);

        // Swap the numbers
        int temp = num1;
        num1 = num2;
        num2 = temp;

        // Print the swapped order of the numbers
        System.out.println("The swapped order of the numbers is " + num1 + " and " + num2);
    }

    /**
     * Task 6: Write a program that allows a user to type in their age. The program should then work out which year they were born and output this to the screen.
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
    }

    /**
     * Task 7: Modified version of task 6, where the user is asked to enter their date of birth and calculate how many days old they are.
     */
    static void taskCalculateDaysOld() {
        // Get the user's date of birth
        int day = InputReader.getInt("Enter the day you were born: ");

        // Month can be entered as either a number or a string
        String monthString = InputReader.getString("Enter the month you were born: ");
        int month;

        // Check if the month is a number or a string
        try {
            month = Integer.parseInt(monthString);
            // Subtract 1 from the month, as months are 0-indexed
            month--;
        } catch (NumberFormatException e) {
            // If the month is a string, convert it to a number
            month = getMonthFromString(monthString);
        }

        // Check if the month is invalid, and throw an error if it is
        if (month == -1)
        {
            System.out.println("Invalid month entered");
            return;
        }

        int year = InputReader.getInt("Enter the year you were born: ");

        // Store the date of birth in a Calendar object
        Calendar dateOfBirth = Calendar.getInstance();
        dateOfBirth.set(year, month, day);

        // Get the current date
        Calendar currentDate = Calendar.getInstance();

        // Calculate the number of days old the user is
        long daysOld = (currentDate.getTimeInMillis() - dateOfBirth.getTimeInMillis()) / (1000 * 60 * 60 * 24);

        // Print the number of days old the user is
        System.out.println("You are " + daysOld + " days old");
    }

    /**
     * Converts a month string to a month number.
     * @param monthString The month string to convert. (e.g. "January")
     * @return The month index (0-11).
     */
    private static int getMonthFromString(String monthString) {
        // Convert the month string to lowercase to avoid case sensitivity issues
        return switch (monthString.toLowerCase()) {
            case "january" -> 0;
            case "february" -> 1;
            case "march" -> 2;
            case "april" -> 3;
            case "may" -> 4;
            case "june" -> 5;
            case "july" -> 6;
            case "august" -> 7;
            case "september" -> 8;
            case "october" -> 9;
            case "november" -> 10;
            case "december" -> 11;
            default -> -1; // Return -1 if the month is invalid
        };
    }
}
