import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i = 1;
        // if (N <= 50 && N >= 0) {
            while (i <= N) {
                int j = 1;
                while (j <= N) {
                    System.out.print(N);
                    j++;
                }
                System.out.println();
                i++;
            // }
        }

    }
}
