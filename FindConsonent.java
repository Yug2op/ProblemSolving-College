public class FindConsonent{
    public static void main(String[] args) {
        String input = "ABCDEFGHIJ";
        char[] str = input.toLowerCase().toCharArray();
        int consonentCount = 0;
        int VovelCount = 0;


        for (int i = 0; i < str.length; i++) {

            if (str[i] == 'a' || str[i] == 'e' || str[i] == 'i' || str[i] == 'o' || str[i] == 'u'  ) {
                VovelCount++;
                System.out.println("Vovel:"+ str[i]);
            }
            else{
                consonentCount ++ ;
                System.out.println("Consonent:"+str[i]);
            }
        }

        System.out.print("consonentCount:");
        System.out.println(consonentCount);
        System.out.print("VovelCount:");
        System.out.println(VovelCount);
    }
}