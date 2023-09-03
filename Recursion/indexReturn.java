import java.util.Scanner;

public class indexReturn {

    public static void indexR(int[] arr , int target , int idx){
        // Base Case
        if(idx == arr.length){
            return;
        }

        //Self Work
        if(arr[idx] == target){
            System.out.print(idx+" ");
        }

        // Recursive Work
        indexR(arr, target, idx+1);
          
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value of target : ");
        int target = sc.nextInt();
        
        indexR(arr , target , 0);
    }
}
