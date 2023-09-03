import java.util.Scanner;

public class fibo {

    public static int fibonacci(int n){
        if(n == 0 || n == 1){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        for (int i = 0 ; i<n ; i++){
            System.out.println(fibonacci(i));
        }        
    }
}
