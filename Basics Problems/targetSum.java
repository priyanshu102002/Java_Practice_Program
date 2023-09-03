import java.util.Scanner;

public class targetSum {
    public static int pairSum(int[] arr , int target){
        int n = arr.length;
        int count = 0;

        for (int i = 0 ; i<n ; i++){
            for(int j = i+1 ; j<n ; j++){
                if(arr[i]+arr[j]==target){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Arrays Size : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter "+n+" element");
        for(int i = 0; i<n ; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter target sum");
        int target = sc.nextInt();

        System.out.println(pairSum(arr,target));
    }
}
