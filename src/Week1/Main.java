package Week1;

import helpers.InputReader;

public class Main {
    /*For this week's exercise, I have sorted the individual tasks into methods, rather than
    completely overwriting the main method.*/
    public static void main(String[] args) {
        taskSwap();
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
}
