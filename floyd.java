public class floyd {
    public static void main(String[] args) {
        int n =4;
        int i = 1;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                
                System.out.print(i+" ");

                i++;
                

                
            }
            System.out.println(" ");
        }
    }
}
