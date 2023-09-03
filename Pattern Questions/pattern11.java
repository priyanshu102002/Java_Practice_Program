import java.util.Scanner;

public class pattern11 {
    public static void main(String[] args) {
        int i = 1;
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();while(i<=n)
    {
        char p = (char) ('A' + i - 1);
        int j = 1;
        while (j <= n) {
            System.out.print(p);
            p = (char) (p + 1);
            j++;
        }
        System.out.println();
        i++;
    }
    }

}
