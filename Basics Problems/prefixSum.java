import java.util.Scanner;
public class prefixSum {
    public static int[] prefixSum(int[] arr){
        int l = arr.length;
        int[] prefix = new int[l];
        prefix[0] = arr[0];

        for(int i = 1 ; i<l ; i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        return prefix;
    }

    // Finding prefix sum without making new array
    public static void prefixSum1(int[] arr){
        int l = arr.length;
        for(int i = 1 ; i<l ; i++){
            arr[i] = arr[i]+arr[i-1];
        }
        // return arr;
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
        int[] ans = prefixSum(arr);
        printArray(ans);
    }
}
