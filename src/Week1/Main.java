package Week1;

import helpers.InputReader;

public class Main {
    /*For this week's exercise, I have sorted the individual tasks into methods, rather than
    completely overwriting the main method.*/
    public static void main(String[] args) {

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
}
