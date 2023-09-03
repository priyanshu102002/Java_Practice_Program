import java.util.Scanner;
public class pattern13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 = (n+1)/2;
        int n2 = n/2;
        int i = 1;
        // For Upper Part
        while (i<=n1){
            int space = 1;
            while (space<=n1-i){
                System.out.print(" ");
                space++;
            }
            int star = 1;
            while(star<=2*i-1){
                System.out.print("*");
                star++;
            }
            System.out.println();
            i++;
        }
        //  For Lower Part
        i = n2;
        while(i>=1){
            int spaces = 1;
            while(spaces<=n2-i+1){
                System.out.print(" ");
                spaces++;
            }
            int stars = 1;
            while(stars<=2*i-1){
                System.out.print("*");
                stars++;
            }
            System.out.println();
            i--;
        }

    }
}
