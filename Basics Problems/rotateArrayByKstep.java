import java.util.Scanner;

public class rotateArrayByKstep {

    /*

Rotating array using extra space by creating new ans array and putting all those values
     
    // public static int[] rotate(int[] arr , int k){
    //     int l = arr.length;
    //     int j = 0;
    //     k = k%l;

    //     int[] ans = new int[l];
    //     for(int i = l-k ; i<l ; i++){
    //         ans[j++] = arr[i];
    //     }

    //     for(int i = 0 ; i<l-k ; i++){
    //         ans[j++] = arr[i];
    //     }
        
    //     return ans;
    // }

    // public static void printArray(int arr[]){
    //     for(int i = 0 ; i<arr.length ; i++){
    //         System.out.print(arr[i]+ " ");
    //     }
    // }

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter array length: ");
    //     int n = sc.nextInt();
    //     int[] arr = new int[n];

    //     System.out.println("Enter "+n+" element: ");
    //     for(int i = 0 ; i<n ; i++){
    //         arr[i]=sc.nextInt();
    //     }

    //     System.out.println("Enter value of k: ");
    //     int k = sc.nextInt();

    //     int[] ans = rotate(arr, k);
    //     printArray(ans);
    // }

    */


    // Rotating array by swap method and reverse method , it does not create extra space.

    public static void swap(int[] arr ,int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void reverseArray(int[] arr,int i , int j){
        while(i<j){
            swap(arr,i, j);
            i++;
            j--;
        }
    }

    public static void rotateInPlace(int[] arr,int k){
        int n = arr.length;
        k = k%n;

        reverseArray(arr, 0, n-k-1);
        reverseArray(arr, n-k, n-1);
        reverseArray(arr, 0, n-1);
    }

    public static void printArray(int[] arr){
        for(int i = 0 ; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter "+n+" element: ");
        for(int i = 0 ; i<n ; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter value of k: ");
        int k = sc.nextInt();
        // printArray(arr);
        rotateInPlace(arr, k);
        printArray(arr);
    }
}
