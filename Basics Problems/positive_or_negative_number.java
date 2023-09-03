import java.util.Scanner;
public class positive_or_negative_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your number ");
        int num1 = sc.nextInt();
        if (num1>0){
            System.out.println("It is a Positive Number");
        }
        else if (num1<0){
            System.out.println("It is a Negative Number");
        }
        else{
            System.out.println("It is zero");
        }
    }
}
