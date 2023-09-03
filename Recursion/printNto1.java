import java.util.Scanner;

public class printNto1 {

    public static void nto1 (int n){
        if(n == 1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        nto1(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        nto1(n);
    }
}
