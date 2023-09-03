import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class quotient_and_remainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of dividend :");
        int dividend = sc.nextInt();

        System.out.println("Enter the value of divisor :");
        int divisor = sc.nextInt();

        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        System.out.println("The vaule of quotient is " + quotient);
        System.out.println("The vaule of remainder is " + remainder);

    }

}
