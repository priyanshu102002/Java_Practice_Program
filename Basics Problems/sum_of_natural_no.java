import java.util.Scanner;
public class sum_of_natural_no {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        // System.out.println("Enter Your Number");
        // int num = sc.nextInt();
        // System.out.println((num*(num+1))/2);

        int sum = 0;
        System.out.println("Enter Your Number");
        int num = sc.nextInt();
        for (int i = 0; i<=num ; i++){
            sum+=i;
        }
        System.out.println(sum);



    }
}
