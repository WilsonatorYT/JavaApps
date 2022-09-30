package Week1;

import helpers.InputReader;

import java.text.NumberFormat;
import java.util.Calendar;

public class Main {
    /*For this week's exercise, I have sorted the individual tasks into methods, rather than
    completely overwriting the main method.*/
    public static void main(String[] args) {
        // Replace the method call with any of the tasks below to run them.
        taskCalculateInterestEndOfYear();
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
     * Task 8: Write a program that will convert the number of feet entered to miles.
     */
    static void taskConvertFeetToMiles() {
        // Get the number of feet to convert
        int feet = InputReader.getInt("Enter the number of feet to convert: ");

        // Calculate the number of miles
        double miles = feet / 5280.0;

        // Round the number of miles to 2 decimal places for readability
        miles = Math.round(miles * 100.0) / 100.0;

        // Print the number of miles
        System.out.println(feet + " feet is " + miles + " miles");
    }

    /**
     * Task 9.a: Write a program that will calculate how much interest will be paid at the end of a year on a savings account.
     * I was unsure whether this meant explicitly at the end of the year, or one year from the deposit date, so I have done both.
     * This method calculates the interest at the end of the year. (31st December)
     */
    static void taskCalculateInterestEndOfYear() {
        // Store the interest rate as a constant (for 1%, this would be 0.01)
        final double INTEREST_RATE = 0.01;

        // Get the amount of money to deposit
        double deposit = InputReader.getDouble("Enter the amount of money to deposit: £");

        // Get the current date
        Calendar currentDate = Calendar.getInstance();

        // Get the end of the year (31st December)
        Calendar endOfYear = Calendar.getInstance();
        endOfYear.set(Calendar.MONTH, Calendar.DECEMBER);
        endOfYear.set(Calendar.DAY_OF_MONTH, 31);

        // Calculate the number of days until the end of the year
        long daysUntilEndOfYear = (endOfYear.getTimeInMillis() - currentDate.getTimeInMillis()) / (1000 * 60 * 60 * 24);

        // Calculate the interest based on the number of days until the end of the year
        double interest = deposit * (daysUntilEndOfYear / 365.0) * INTEREST_RATE;

        // Round the interest to 2 decimal places for readability
        interest = Math.round(interest * 100.0) / 100.0;

        // Calculate the amount of money after the interest is paid
        double total = deposit + interest;

        // Since we are outputting a monetary value, we should use the currency format
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
        currencyFormat.setMaximumFractionDigits(2);

        // Get the output string using the currency format
        String output = currencyFormat.format(total);

        // Print the output
        System.out.println("At the end of the year, you will have " + output);
    }

    /**
     * Task 9.b: Write a program that will calculate how much interest will be paid at the end of a year on a savings account.
     * I was unsure whether this meant explicitly at the end of the year, or one year from the deposit date, so I have done both.
     * This method calculates the interest one year from the deposit date.
     */
    static void taskCalculateInterestOneYear() {
        // Store the interest rate as a constant (for 1%, this would be 0.01)
        final double INTEREST_RATE = 0.01;

        // Get the amount of money to deposit
        double deposit = InputReader.getDouble("Enter the amount of money to deposit: £");

        // Calculate the interest after one year
        double interest = deposit * INTEREST_RATE;

        // Round the interest to 2 decimal places for readability
        interest = Math.round(interest * 100.0) / 100.0;

        // Calculate the amount of money after the interest is paid
        double total = deposit + interest;

        // Since we are outputting a monetary value, we should use the currency format
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
        currencyFormat.setMaximumFractionDigits(2);

        // Get the output string using the currency format
        String output = currencyFormat.format(total);

        // Print the output
        System.out.println("After one year, you will have " + output);
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
