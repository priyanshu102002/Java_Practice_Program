import java.util.Scanner;
public class rotate {

    public static void transpose(int[][] matrix , int a , int b){
        for(int i = 0 ; i<b ; i++){
            for(int j = i ; j<a ; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public static void reverseArray(int[] arr){
        int i = 0 ;
        int j = arr.length-1 ;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void rotateMatrix(int[][] matrix , int a , int b){
        transpose(matrix , a , b);

        for(int i = 0 ; i<a ; i++){
            reverseArray(matrix[i]);
        }

    }

    public static void printArray(int[][] arr){
        System.out.println("Resultant Matrix will be :");
        for (int i = 0 ; i<arr.length ; i++){
            for(int j = 0 ; j<arr.length[i] ; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a : ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b : ");
        int b = sc.nextInt();

        int[][] matrix = new int[a][b];
        for (int i = 0 ; i<a ; i++){
            for (int j = 0 ; j<b ; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        rotateMatrix(matrix, a, b);
        printArray(matrix);
        
    }
}
