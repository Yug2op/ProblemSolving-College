public class Pattern9 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i>=1) {
                for (int j2 = 0; j2 < i; j2++) {
                    System.out.print(" ");
                }
            }
            for (int j = i; j <4 ; j++) {
                
                System.out.print((char) ('D' - j) + " ");
            }
            System.out.println();
        }
    }
}
