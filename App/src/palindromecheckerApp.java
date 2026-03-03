import java.util.Stack;

/**
 * =========================================================
 * MAIN CLASS - PalindromeCheckerApp
 * =========================================================
 *
 * Use Case 13: Performance Comparison
 *
 * Description:
 * This class measures and compares the execution
 * performance of palindrome validation algorithms.
 *
 * It:
 * - Uses a palindrome checking approach
 * - Captures execution start and end time
 * - Calculates total execution duration
 * - Displays benchmarking results
 *
 * This use case focuses purely on performance
 * measurement and algorithm comparison.
 *
 * @author Oviya-Babu
 * @version 13.0
 */

class PalindromeCheckerApp {

    /**
     * Application entry point for UC13.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        String input = "level";

        // Capture start time
        long startTime = System.nanoTime();

        // Execute palindrome logic
        boolean isPalindrome = checkUsingStack(input);

        // Capture end time
        long endTime = System.nanoTime();

        // Calculate execution duration
        long executionTime = endTime - startTime;

        // Display results
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
        System.out.println("Execution Time : " + executionTime + " ns");
    }

    /**
     * Stack-based palindrome check.
     */
    private static boolean checkUsingStack(String input) {

        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}