import java.util.Scanner;


public class sum_of_two_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number :");
        int num1 = sc.nextInt();
        
        System.out.println("Enter Second number :");
        int num2 = sc.nextInt();

        int sum = num1+num2;

        System.out.println("The sum of two number is : "+sum);
        

    }
}
