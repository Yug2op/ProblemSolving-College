public class BinaryToDecimal {
    public static int convertBinaryToDecimal(String binary) {
        int decimal = 0;
        int base = 1; // 2^0

        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                decimal += base;
            }
            base *= 2;
        }

        return decimal;
    }

    public static void main(String[] args) {
        String binary = "1010"; // Example binary number
        int decimal = convertBinaryToDecimal(binary);
        System.out.println("Binary: " + binary + " -> Decimal: " + decimal);
    }
}
