class ArrayShorting{
    static boolean arrayShortedOrNot(int arr[],int n){
        if(n==0 || n==1)
        return true;

        for (int i = 1; i<n; i++){
            if(arr[i-1]>arr[i])
            return false;
        }
        return true;
    }  

    public static void main(String[] args) {
        int arr[] = {4,30,40,50};
        int n = arr.length;

        if (arrayShortedOrNot(arr, n))
        System.out.print("Yes\n");
        else{
            System.out.println("No\n");
        }
    }
}
