import java.util.Scanner;
public class reverseRowOfMatrix {

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

    public static void reverse(int[][] matrix){
        for (int i = 0 ; i<matrix.length ; i++){
            reverseArray(matrix[i]);
        }
    }

    public static void print2dMatrix (int[][] matrix){
        System.out.println("Resultant Matrix will be: ");
        for(int i = 0 ; i<matrix.length ; i++){
            for(int j = 0 ; j<matrix[i].length ; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking Matrix1 as a input 
        System.out.println("Enetr the value of r1 : ");
        int r1 = sc.nextInt();
        System.out.println("Enetr the value of c1 : ");
        int c1 = sc.nextInt();
        int[][] matrix1 = new int[r1][c1];
        System.out.println("Enter Matrix1 Values: ");
        for(int i = 0 ; i<r1 ; i++){
            for(int j = 0 ; j<c1 ; j++){
                matrix1[i][j] = sc.nextInt();
            }
        }

        reverse(matrix1); 
        print2dMatrix(matrix1);
    }
}

