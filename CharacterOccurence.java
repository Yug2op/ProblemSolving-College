import java.util.Scanner;
public class CharacterOccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char arr[] = {'a','b','c','d'};
        System.out.println("Enter a character to check: ");
        char unit = sc.next().charAt(0);
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==unit) {
                count++;
            }
        }
        if(count>0)
        System.out.println("Charecter "+ unit + " is present "+ count +" times.");
        else
        System.out.println("Charecter "+ unit + " is not present.");


        sc.close();
    }
}
