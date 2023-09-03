import java.util.Scanner;
public class sortZeroOnes {
    public static void sortArray(int[] arr){
        int l = arr.length;
        int zeros = 0;
        for(int i = 0 ; i<l ; i++){
            if(arr[i]==0){
                zeros++;
            }
        }
        for(int i = 0; i<l ; i++){
            if(i<zeros){
                arr[i] = 0;
            }
            else{
                arr[i] = 1;
            }
        }
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
        int[] arr = new int[n];

        System.out.println("Enter "+n+" array item.");
        for(int i = 0; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        sortArray(arr);
        printArray(arr);
    }
}
