import java.util.Scanner;

public class arraySum {

    // Normal Method using for loop
    // public static int arrSum(int[] arr){
    //     int sum = 0; 
    //     for ( int i = 0 ; i< arr.length ; i++){
    //         sum+=arr[i];
    //     }
    //     return sum;
    // }

    public static int arrSum(int[] arr , int idx){
        // Base case
        if(idx == arr.length-1){
            return arr[idx];
        }

        // Recursive work
        int smallAns = arrSum(arr, idx+1);

        // Self Work
        return smallAns + arr[idx];
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i<n ; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println(arrSum(arr,0));

    }
}
