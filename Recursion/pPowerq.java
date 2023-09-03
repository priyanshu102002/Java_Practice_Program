import java.util.Scanner;

public class pPowerq {

    // Simple Method using loop
    // public static int power(int p , int q){
    //     int mul = p;
    //     for(int i = 0 ; i<q-1 ; i++){
    //         mul *= p;
    //     }
    //     return mul;
    // }

    // Simple Recursive Work
    // public static int power (int p , int q){
    //     if(q==0){
    //         return 1;
    //     }
    //     return power(p, q-1)*p;
    // }

    // Best way for time and space complixity
    public static int power (int p , int q){
        if(q==0){
            return 1;
        }
        if(q%2==0){
            int pow = power(p, q/2);
            return pow*pow;
        }
        else{
            int pow = power(p, q/2);
            return pow*pow*p;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the the value of p : ");
        int p = sc.nextInt();
        System.out.println("Enter the value of q : ");
        int q = sc.nextInt();

        System.out.print("The result is " +power(p,q));
    }
}
