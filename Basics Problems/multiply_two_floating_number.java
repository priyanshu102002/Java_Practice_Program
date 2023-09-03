import java.util.Scanner;

public class multiply_two_floating_number {
    public static void main(String[] args) {

        // float num1 = 12.55555f;
        // float num2 = 10.5550f;
        // System.out.println(num1*num2);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Floating Number : ");
        float num1 = sc.nextFloat();
        System.out.println("Enter Second Floating Number : ");
        float num2 = sc.nextFloat();

        float mul = num1 * num2;

        System.out.println("The Multiplication of two number is : " + mul);

    }
}
