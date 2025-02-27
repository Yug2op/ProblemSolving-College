// create a class and user defined function and display all the prime numbers in given range.

//  input a number from user and check wheather a number is perfect number or not.

import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the lower bound of the range: ");
        int lower = scanner.nextInt();
        System.out.print("Enter the upper bound of the range: ");
        int upper = scanner.nextInt();
        displayPrimeNumbers(lower, upper);
        scanner.close();
    }

    public static void displayPrimeNumbers(int lower, int upper) {
        for (int i = lower; i <= upper; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}