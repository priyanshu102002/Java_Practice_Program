import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        int m = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int num = sc.nextInt();

        for(int i =1; i<=num; i++){
            m=m*i;
        }
        System.out.println(m);

    }
}
