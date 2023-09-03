import java.util.Scanner;
public class equalSumArray {
    //  Also a Method but it takes more space and time.
    /*
    public static boolean sumDivider(int[] arr){
        int l = arr.length;
        for(int i = 0 ; i<l-1 ; i++){
            if(arr[i]*2==arr[l-1]){
                return true;
            }
        }
        return false;
    }
    */

    public static int findArraySum(int[] arr){
        int sum = 0;
        for(int i = 0 ; i<arr.length ; i++){
            sum+=arr[i];
        }
        return sum;
    }

    public static boolean equalSumPatition(int[] arr){
        int totalSum = findArraySum(arr);

        int preSum = 0;
        for(int i = 0 ; i<arr.length ; i++){
            preSum+=arr[i];

            int suffixSum = totalSum - preSum; 
            if(suffixSum == preSum){
                return true;
            }
        }
        return false;
    }

    public static int[] prefixSumArray(int[] arr){
        int l = arr.length;
        for(int i = 1 ; i<l ; i++){
            arr[i] = arr[i]+arr[i-1];
        }
        return arr;
    }

    public static void printArray(int[] arr){
        for (int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter "+n+" array item.");
        for(int i = 0; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        // int[] prefixSum = prefixSumArray(arr);
        // System.out.println(sumDivider(prefixSum));

        System.out.println(equalSumPatition(arr));
       
    }
}
