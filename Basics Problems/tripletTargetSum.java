import java.util.Scanner;

public class tripletTargetSum {

    public static int tripleSum(int[] arr , int target){
        int n = arr.length;
        int count = 0;
        for(int i = 0 ; i<n ; i++){
            for(int j = i+1 ; j<n ; j++){
                for(int k = j+1 ; k<n ; k++){
                    if(arr[i]+arr[j]+arr[k]==target){
                        count++;
                    }
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of an array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter "+n+" Element");
        for(int i = 0; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter Target ");
        int target = sc.nextInt();

        System.out.println(tripleSum(arr,target));

    }
}
