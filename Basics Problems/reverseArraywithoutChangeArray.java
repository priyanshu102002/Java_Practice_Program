import java.util.Scanner;
//  reverse array without changing the array

public class reverseArraywithoutChangeArray {
    
    public static void swap(int[] arr,int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void reverseArray(int[] arr){
        int l = arr.length;
        int i =0 ; 
        int j = l-1;
        while(i<j){
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    public static void printArray(int[] arr){
        
        for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter "+n+" array item.");
        for(int i = 0; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        reverseArray(arr); 
        printArray(arr);
        
    }
}



