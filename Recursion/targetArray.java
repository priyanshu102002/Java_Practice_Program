import java.util.Scanner;

public class targetArray {

    // public static boolean target(int[] arr , int x){
    //     boolean flag = false;
    //     for(int i= 0 ; i<arr.length ; i++){
    //         if(arr[i]==x){
    //             flag = true;
    //         }
    //     }
    //     return flag;
    // }

    public static boolean target(int[] arr , int idx ,int x){

        // Base Case
        if(idx == arr.length){
            return false;
        }

        // Self Work
        if(arr[idx]==x){
            return true;
        }

        // Recursive Work
       if(target(arr, idx+1, x)){
        return true;
       }
       else{
        return false;
       }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value of target : ");
        int x = sc.nextInt();

        if(target(arr,0,x)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }
}
