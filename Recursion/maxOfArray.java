import java.util.Scanner;

public class maxOfArray {

    // public static int max(int[] arr) {
    //     int min = Integer.MIN_VALUE;
    //     for(int i = 0 ; i<arr.length ; i++){
    //         if(arr[i]>min){
    //             min = arr[i];
    //         }
    //     }
    //     return min;
    // }

    public static int max(int[] arr , int idx){

        // Base case
        if(idx == arr.length-1){
            return arr[idx];
        }

        // Recursive work
        int smallAns = max(arr, idx+1);

        // Self Work
        if(arr[idx]>=smallAns){
            return arr[idx];
        }
        else{
            return smallAns;
        }
    }

    public static void printArray(int[] arr , int idx){
        if(idx == arr.length){
            return;
        }
        System.out.print(arr[idx]+" ");
        printArray(arr, idx+1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0 ; i<n ; i++){
            arr[i]=sc.nextInt();
        }

        // printArray(arr, 0);

        System.out.println(max(arr ,0));
    }
}
