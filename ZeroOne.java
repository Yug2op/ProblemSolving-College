public class ZeroOne {
    public static void main(String[] args) {
        String input = "0010101";
        int countZero = 0;

        for (char c : input.toCharArray()) {
            if (c == '0') {
                countZero++;
            }
        }

        StringBuilder output = new StringBuilder();
        for (int i = 0; i < countZero; i++) {
            output.append('0');
        }
        for (int i = countZero; i < input.length(); i++) {
            output.append('1');
        }

        System.out.println(output.toString());
    }
}
