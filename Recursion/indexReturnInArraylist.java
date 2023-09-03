import java.util.ArrayList;
import java.util.Scanner;

public class indexReturnInArraylist {
    public static ArrayList<Integer> indexR(int[] arr , int target , int idx){

        ArrayList<Integer> ans = new ArrayList<>();

        // Base Case
        if(idx == arr.length){
            return ans;
        }

        //Self Work
        if(arr[idx] == target){
            ans.add(idx);
        }

        // Recursive Work
        ArrayList<Integer> smallAns = indexR(arr, target, idx+1);
        ans.addAll(smallAns);
        return ans;
          
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
        
        System.out.println(indexR(arr , target , 0));
    }
}
