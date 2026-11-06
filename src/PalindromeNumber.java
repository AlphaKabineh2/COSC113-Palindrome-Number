
// GitHub Repository: https://github.com/AlphaKabineh2/COSC113-Palindrome-Number

import java.util.Scanner;

public class PalindromeNumber {

    public static boolean isPalindrome(int number, int divisor) {

        // Base case
        if (number < 10) {
            return true;
        }

        // Get first and last digits
        int firstDigit = number / divisor;
        int lastDigit = number % 10;

        // Compare digits
        if (firstDigit != lastDigit) {
            return false;
        }

        // Remove first and last digits
        number = (number % divisor) / 10;

        // Recursive call
        return isPalindrome(number, divisor / 100);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        if (number < 0) {
            System.out.println(number + " is not a palindrome.");
        } else {

            int divisor = 1;
            int temp = number;

            while (temp >= 10) {
                divisor *= 10;
                temp /= 10;
            }

            if (isPalindrome(number, divisor)) {
                System.out.println(number + " is a palindrome.");
            } else {
                System.out.println(number + " is not a palindrome.");
            }
        }

        input.close();
    }
}
