import java.util.Scanner;

public class gcd {

    // USING LOOP
    // public static int gcd(int a , int b){
    //     if(a>=b){
    //         for (int i = b ; i>=1 ; i--){
    //             if(a%i==0 && b%i==0){
    //                 return i;
    //             }
    //         }
    //     }
    //     if(a<b){
    //         for (int i = a ; i>=1 ; i--){
    //             if(a%i==0 && b%i==0){
    //                 return i;
    //             }
    //         }
    //     }
    //     return 1; 
    // }

    // USING DIVISION METHOD
    // public static int gcd(int a , int b){
    //     while (a%b!=0){
    //         int rem = a%b;
    //         a = b;
    //         b = rem;
            
    //     }
    //     return b;
    // }

    // USING RECURSION
    public static int gcd(int a , int b){
        if (b == 0){
            return a;
        }

        return gcd(b, a%b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a : ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b : ");
        int b = sc.nextInt();

        System.out.println("Result is : "+gcd(a, b));
    }
}
