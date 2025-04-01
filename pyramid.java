public class pyramid {
    public static void main(String[] args) {
        int n = 5; // Number of rows

        for (int row = 1; row <= n; row++) { 
            // Print spaces
            for (int col = 1; col <= n - row; col++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= (2 * row - 1); j++) {
                System.out.print("*");            }
            System.out.println(); // Move to next line
        }
    }
}
