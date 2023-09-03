import java.util.Scanner;

public class ascii_value_to_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Character : ");

        char ch = sc.next().charAt(0);
        int castAscii = (int)ch;
        System.out.println(castAscii);
    }
}
