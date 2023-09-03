import java.util.Scanner;

public class compiler {

    public static void swap(int a , int b){
        int temp = a;
        a = b ;
        b = temp;
    }

    public static void sortedArray(int[] arr){
        int l = arr.length;
        for(int i = 0 ; i<l-1 ; i++){
            int index = 0;
            int least = Integer.MAX_VALUE;
            if(arr[i]<least){
                least = arr[i];
            }
            swap(arr[i],least);
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
        System.out.println(sortedArray(arr));
    }
}


