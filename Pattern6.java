public class Pattern6 {
    public static void main(String[] args) {
        for (int i = 0; i <=5; i++) {
            for (int j = 0; j < args.length; j++) {
                System.out.print("");
            }
            for (int j = 0; j < i; j++) {
                System.out.print((char)('A' + j));
            }
            System.out.println();
        }
    }
}
