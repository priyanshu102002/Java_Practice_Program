import java.util.Scanner;
import java.lang.Math;
public class squareOfTwoNumber {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        // Power function only wprks on double data type 
        double power = Math.pow(x, n);
        
        System.out.println((int)(power));
    }
}
