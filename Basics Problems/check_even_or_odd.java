import java.util.Scanner;
public class check_even_or_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number :");
        int num = sc.nextInt();

        if(num%2==0){
            System.out.println(num+" is a even number.");
        }

        else{
            System.out.println(num+" is a odd number");
        }

    }
}
