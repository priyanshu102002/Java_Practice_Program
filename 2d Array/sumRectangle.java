import java.util.Scanner;

public class sumRectangle {
    
    // Brute force Method
    public static int sum(int[][] matrix , int r , int c , int l1 , int n1 ,int l2 , int n2){
        int sum = 0 ;
        for(int i = l1 ; i <= l2 ; i++ ){
            for(int j = n1 ; j <= n2 ; j++){
                sum += matrix[i][j];
            }
        }
        return sum;
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
        System.out.println("Enter the value of r : ");
        int r = sc.nextInt();
        System.out.println("Enter the value of c : ");
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];

        for(int i = 0 ; i<r ; i++){
            for(int j = 0 ; j<c ; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the value of l1 : ");
        int l1 = sc.nextInt();
        System.out.println("Enter the value of n1 : ");
        int n1 = sc.nextInt();

        System.out.println("Enter the value of l2 : ");
        int l2 = sc.nextInt();
        System.out.println("Enter the value of n2 : ");
        int n2 = sc.nextInt();

        int result = sum(matrix,r,c,l1,n1,l2,n2);
        System.out.println("Result will be "+result);

    } 
}
