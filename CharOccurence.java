public class CharOccurence {
    public static void main(String[] args) {

        String str = "Program";
        char[] string = str.toLowerCase().toCharArray();

        System.out.println("Enter a character to check: "); 

        for (char unit : string) {
            int count = 0;
            for (int i = 0; i < string.length; i++) {
                if (string[i] == unit) {
                    count++;
                }
            }
            if (count > 0)
                System.out.println("Charecter " + unit + " is present " + count + " times.");
            else
                System.out.println("Charecter " + unit + " is not present.");

        }
    }
}
