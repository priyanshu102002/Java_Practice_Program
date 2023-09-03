import java.util.Scanner;
public class indexSum {
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
        int[] arr = new int[n+1];

        System.out.println("Enter "+n+" array item.");
        for(int i = 1; i<n+1 ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter no of queries: ");
        int q = sc.nextInt();

        int[] prefixSum = prefixSumArray(arr);

        while(q-- >0){
            System.out.println("Enter value of l: ");
            int l = sc.nextInt();
            System.out.println("Enter value of r: ");
            int r = sc.nextInt();
            
            int ans = prefixSum[r]-prefixSum[l-1];
            System.out.println("Sum: "+ans);
        }

    }
}
