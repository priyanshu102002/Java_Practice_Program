import java.util.Arrays;
import java.util.Scanner;

public class secondLargestNumber {

    public static int secondLargest(int[] arr){
        int n = arr.length;
        Arrays.sort(arr);
        int ans = -1;
        for(int i =0 ; i<n; i++){
            ans = arr[n-2];
        }
        return ans;
    }
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of array ");
    int n = sc.nextInt();
    int[] arr = new int[n];

    System.out.println("Enter "+n+" element ");
    for(int i = 0 ; i<n ; i++){
        arr[i] = sc.nextInt();
    }

    System.out.println(secondLargest(arr));
   }
}



