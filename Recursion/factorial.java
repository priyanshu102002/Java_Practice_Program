import java.util.Scanner;

public class factorial {

    public static long factorial(long n){
        if (n==0){
            return 1 ;
        }
        long ans = n*factorial(n-1);
        return ans;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        long n = sc.nextLong();

        long ans = factorial(n);
        System.out.println("Ans is : "+ ans);
    }
}
