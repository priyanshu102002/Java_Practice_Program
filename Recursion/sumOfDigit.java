import java.util.Scanner;
public class sumOfDigit {

    // public static int sum(int n ){
    //     int s = 0; 
    //     while(n!=0){
    //         int mod = n%10; 
    //         n = n/10;
    //         s+=mod;
    //     }
    //     return s;
    // }

    public static int sod (int n ){ 
        if (n>=0 && n<10){
            return n ;
        }
        return sod(n/10)+n%10;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        
        // System.out.println(sum(n));
        System.out.println(sod(n));
    }
}
