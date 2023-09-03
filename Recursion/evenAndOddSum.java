import java.util.Scanner;

public class evenAndOddSum {

    // public static int sum(int n){
    //     int evenSum = 0;
    //     int oddSum = 0;

    //     for(int i = 1 ; i<=n ; i++){
    //         oddSum+=i;
    //         i++;
    //     }
    //     for(int i = 0 ; i<=n ; i++){
    //         evenSum+=i;
    //         i++;
    //     }
    //     int result = oddSum - evenSum;
    //     return result;
    // }
    
    public static int sum(int n){
        if(n==0){
            return n;
        }
        if(n%2==0){
            return sum(n-1)-n;
        }
        else{
            return sum(n-1)+n;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        System.out.println("Result is : "+ sum(n));
    }
}
