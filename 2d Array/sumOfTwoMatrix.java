import java.util.Scanner;

public class sumOfTwoMatrix {

    public static void print2dMatrix (int[][] matrix){
        System.out.println("Resultant Matrix will be: ");
        for(int i = 0 ; i<matrix.length ; i++){
            for(int j = 0 ; j<matrix[i].length ; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void sumOfMatrix(int[][] matrix1 ,int r1 ,int c1 ,int[][] matrix2 , int r2 , int c2){
        if(r1 != r2 || c1 != c2){
            System.out.println("Programme Terminate due to wrong dimensions given ");
            return;
        }
        int[][] ResultantMatrix = new int[r1][c1];
        for(int i = 0 ; i<r1 ; i++){
            for(int j = 0 ; j<c1 ; j++){
                ResultantMatrix[i][j] = matrix1[i][j] + matrix2[i][j] ;
            }
        }
        print2dMatrix(ResultantMatrix);
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

        // Taking Matrix2 as a input
        System.out.println("Enetr the value of r2 : ");
        int r2 = sc.nextInt();
        System.out.println("Enetr the value of c2 : ");
        int c2 = sc.nextInt();
        int[][] matrix2 = new int[r2][c2];
        System.out.println("Enter Matrix2 Values: ");
        for(int i = 0 ; i<r2 ; i++){
            for(int j = 0 ; j<c2 ; j++){
                matrix2[i][j] = sc.nextInt();
            }
        }

        sumOfMatrix(matrix1, r1, c1, matrix2, r2, c2);
    }
}
