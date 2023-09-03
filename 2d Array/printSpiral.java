import java.util.Scanner;
public class printSpiral {

    public static void printArray(int[][] matrix){
        for(int i = 0 ; i<matrix.length ; i++){
            for(int j = 0 ; j<matrix[i].length ; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static int[][] spiral(int n){
        int[][] matrix = new int[n][n];

        int totalElement = 0;
        int start = 1;
        int topRow = 0 , bottomRow = n-1 , rightCol = n-1 , leftCol = 0;

        while(totalElement < n*n){

            // topRow -> topCol = 0 , topCol = n-1;
            for(int j = leftCol ; j <= rightCol && totalElement < n*n ; j++){
                matrix[topRow][j] = start;
                start++;
                totalElement++;
            }
            topRow++;

            // rightCol -> toprow = 0 , topCol = m-1;
            for(int i = topRow ; i <= bottomRow && totalElement < n*n ; i++){
                matrix[i][rightCol] = start;
                start++;
                totalElement++;
            }
            rightCol--;

            // bottomRow -> leftCol = rightCol , rightCol = leftCol
            for(int j = rightCol ; j >= leftCol && totalElement < n*n ; j--){
                matrix[bottomRow][j] = start;
                start++;
                totalElement++;
            }
            bottomRow--;
            
            // leftCol -> bottomRow to topRow
            for(int i = bottomRow ; i>= bottomRow && totalElement < n*n ; i--){
                matrix[i][leftCol] = start;
                start++;
                totalElement++;
            }
            leftCol++;

        }
        return matrix;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();

        spiral(n);
        int[][] matrix1 = spiral(n);
        printArray(matrix1);
        
    } 
}
