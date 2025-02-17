public class LargestInArry{
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,11,6,7,8} ;
        int LargestInArry = arr[0];
        for (int i = 0; i < arr.length; i++) {
            
            if (arr[i]>LargestInArry) {
                LargestInArry = arr[i];
            }
        }
        System.out.println("Largest number is:" + LargestInArry);
    }
}