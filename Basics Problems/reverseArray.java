import java.util.Scanner;
public class reverseArray {
    
    public static void reverse(int[] arr){
        int l = arr.length;

        // for(int i = l-1; i>=0 ;i--){
        //     System.out.print(arr[i]+" ");
        // }

        int[] ans = new int[l];
        int j = 0;
        
        // Inserting numbers in ans array
        for(int i = l-1; i>=0 ; i--){
            ans[j++] = arr[i];
        }
        
        // To Print reversed array
        for(int i = 0 ; i<l ; i++){
            System.out.print(ans[i]+" ");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter "+n+" element : ");
        for(int i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        reverse(arr); 
    }
}
