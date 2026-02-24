/**
 MAIN CLASS UseCaseiPalindromeApp
 Use Case 1: Application Entry & Welcome Message
 Description:
 This class represents the entry point of the * Palindrome Checker Management System.
 At this stage, the application:
 Starts execution from the main() method
 * - Displays a welcome message
 Shows application version
 No palindrome logic is implemented yet.
 The goal is to establish a clear startup flow.
 @author Oviya-Babu
 @version 1.0
 */
import java .util.Scanner;
public class PalindromeCheckerApp {
    /**
     * Application entry point for UC3.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        String input = "madam"; // Example input string
        String reversedInput = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversedInput += input.charAt(i);
        }

        if (input.equals(reversedInput)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
}