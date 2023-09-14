// print n to 1 using recursion and store it into array 
import java.util.Scanner;

public class oneToNInArray {
    public static int[] printNos(int x) {
        int[] arr = new int[x];
        solve(x, arr);
        return arr;
    }

    public static void solve(int x, int[] arr) {
        if (x == 0) {
            return;
        }
        arr[arr.length - x] = x;
        solve(x - 1, arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x: ");
        int x = sc.nextInt();
        
        int[] arr = printNos(x);
        System.out.println("Results are: ");
        for (int i = 0 ; i<arr.length ; i++){
            System.out.println(arr[i]);
        }
    }
}
