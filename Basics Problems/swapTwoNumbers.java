import java.util.Scanner;

public class swapTwoNumbers {
    
    public static void swap(int num1 , int num2){
        
        // int temp = num1;
        // num1 = num2;
        // num2 = temp;

        num1 = num1+num2;
        num2 = num1-num2;
        num1 = num1-num2;

        System.out.println("The value of num1 is "+num1);
        System.out.println("The value of num2 is "+num2);

    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter num2 : ");
        int num2 = sc.nextInt();
        
        swap(num1, num2);
    }
}
