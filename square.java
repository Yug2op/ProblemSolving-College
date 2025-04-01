public class square {
    public static void main(String[] args) {
        int n=4;

        for (int row = 1; row <=n; row++) {
            for (int col = 1; col <= 5; col++) {
                if (row==2&&(col==2||col==3||col==4) ) {
                    System.out.print("  ");
                }
                else if(row==3&&(col==2||col==3||col==4) ) {
                    System.out.print("  ");
                }
                else{
                System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
