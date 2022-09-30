package Week1;

import helpers.InputReader;

public class Main {
    /*For this week's exercise, I have sorted the individual tasks into methods, rather than
    completely overwriting the main method.*/
    public static void main(String[] args) {
        taskOutputRectangle();
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
}
