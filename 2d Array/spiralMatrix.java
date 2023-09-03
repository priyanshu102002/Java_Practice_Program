import java.util.Scanner;

public class spiralMatrix {

    public static void spiral(int[][] matrix , int n , int m){
        int totalElement = 0;
        int topRow = 0 , bottomRow = n-1 , rightCol = m-1 , leftCol = 0;

        while(totalElement < n*m){

            // topRow -> topCol = 0 , topCol = n-1;
            for(int j = leftCol ; j <= rightCol && totalElement < n*m ; j++){
                System.out.print(matrix[topRow][j]+" ");
                totalElement++;
            }
            topRow++;

            // rightCol -> toprow = 0 , topCol = m-1;
            for(int i = topRow ; i <= bottomRow && totalElement < n*m ; i++){
                System.out.print(matrix[i][rightCol]+" ");
                totalElement++;
            }
            rightCol--;

            // bottomRow -> leftCol = rightCol , rightCol = leftCol
            for(int j = rightCol ; j >= leftCol && totalElement < n*m ; j--){
                System.out.print(matrix[bottomRow][j]+" ");
                totalElement++;
            }
            bottomRow--;
            
            // leftCol -> bottomRow to topRow
            for(int i = bottomRow ; i>= bottomRow && totalElement < n*m ; i--){
                System.out.print(matrix[i][leftCol]+" ");
                totalElement++;
            }
            leftCol++;
        }
    }

    public static void printArray(int[][] matrix){
        for(int i = 0 ; i<matrix.length ; i++){
            for(int j = 0 ; j<matrix[i].length ; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        System.out.println("Enter the value of m : ");
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];

        for(int i = 0 ; i<n ; i++){
            for(int j = 0 ; j<m ; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        spiral(matrix,n,m);
    } 
}
