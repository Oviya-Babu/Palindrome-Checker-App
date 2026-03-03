import java.util.Stack;

/**
 * =========================================================
 * MAIN CLASS - PalindromeCheckerApp
 * =========================================================
 *
 * Use Case 12: Strategy Pattern for Palindrome Algorithms
 *
 * Description:
 * This class demonstrates how different palindrome
 * validation algorithms can be selected dynamically
 * at runtime using the Strategy Design Pattern.
 *
 * The application:
 * - Defines a common PalindromeStrategy interface
 * - Implements a concrete Stack based strategy
 * - Injects the strategy at runtime
 * - Executes the selected algorithm
 *
 * The focus is on algorithm interchangeability.
 *
 * @author Oviya-Babu
 * @version 12.0
 */

class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "level";

        // Inject strategy at runtime
        PalindromeStrategy strategy = new StackStrategy();

        boolean isPalindrome = strategy.check(input);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}

/**
 * =========================================================
 * INTERFACE - PalindromeStrategy
 * =========================================================
 *
 * Defines a contract for all palindrome checking algorithms.
 */
interface PalindromeStrategy {

    boolean check(String input);
}

/**
 * =========================================================
 * CLASS - StackStrategy
 * =========================================================
 *
 * Provides a Stack based implementation of
 * the PalindromeStrategy interface.
 *
 * Uses LIFO behavior to reverse characters
 * and compare them with original sequence.
 */
class StackStrategy implements PalindromeStrategy {

    /**
     * Implements palindrome validation using Stack.
     *
     * @param input Input string to validate
     * @return true if palindrome, false otherwise
     */
    public boolean check(String input) {

        // Create a stack to store characters
        Stack<Character> stack = new Stack<>();

        // Push each character onto the stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Compare characters by popping from stack
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}