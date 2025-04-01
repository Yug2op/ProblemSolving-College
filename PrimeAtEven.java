public class PrimeAtEven {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
        System.out.println("Prime numbers at even indices:");
        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 0 && isPrime(numbers[i])) {
            System.out.println("Index " + i + ": " + numbers[i]);
            }
        }
        }

        private static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
        }
}
