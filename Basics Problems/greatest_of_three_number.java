import java.util.Scanner;
public class greatest_of_three_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number ");
        int a = sc.nextInt();
        System.out.println("Enter Second Number ");
        int b = sc.nextInt();
        System.out.println("Enter Third Number ");
        int c = sc.nextInt();

        if(a>b && a>c){
            System.out.println(a+" is greatest number");
        }
        else if(b>c && b>a){
            System.out.println(b+" is greatest number");
        }

        else if(c>a && c>b){
            System.out.println(c+" is greatest number");
        }
    }
}
