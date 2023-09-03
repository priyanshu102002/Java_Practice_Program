import java.util.Scanner;

public class transposeOfMatrix {

    public static int[][] transpose(int[][] array , int a , int b ){
        int[][] Matrix1 = new int[b][a];
        for(int i = 0 ; i<a ; i++){
            for(int j = 0 ; j<b ; j++){
                Matrix1[i][j] = array[j][i];
            }
        }
        return Matrix1;
    }


    public static void printArray(int[][] arr){
        System.out.println("Resultant Matrix will be :");
        for (int i = 0 ; i<arr.length ; i++){
            for(int j = 0 ; j<arr.length ; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void inPlaceTranspose(int[][] arr , int a , int b ){
        for(int i = 0 ; i<b ; i++){
            for(int j = i ; j<a ; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
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

        System.out.println("Resultant Matrix will be : ");
        int[][] Matrix1 = transpose(matrix, a, b);
        printArray(Matrix1);

        // inPlaceTranspose(matrix, a, b);
        // printArray(matrix);
        
    }
}
