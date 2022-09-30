package Week1;

import helpers.InputReader;

public class Main {
    public static void main(String[] args) {
        // Get the name of the user
        System.out.println("What is your name?");
        String name = InputReader.getString("");

        // Print a message saying hello to the user
        System.out.println("Hello " + name);
    }
}
