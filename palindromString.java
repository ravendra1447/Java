package JAVA;

public class palindromString {

    public static boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(reversed); // Using equalsIgnoreCase to check for palindrome
    }

    public static void main(String[] args) {
        String str = "madam"; // Change this to any string to check for palindrome
        String rev = "";

        // Reverse the string using a loop
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            rev = rev + ch;
        }

        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + rev);

        // Check for palindrome using reversed string
        if (str.equalsIgnoreCase(rev)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
 