import java.util.Scanner;

public class kMultiples {

    // Using simple for loop
    // public static void multiples(int num , int k ){
    //     for(int i = 1 ; i<=k ; i++){
    //         System.out.println(num*i);
    //     }
    // }

    public static void multiples(int num , int k ){
        // Base Case
        if (k==1){
            System.out.println(num);
            return ;
        }
        // Recursive Work
        multiples(num, k-1);

        // Self Work
        System.out.println(num*k);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of num : ");
        int num = sc.nextInt();
        System.out.println("Enter the value of k : ");
        int k = sc.nextInt();

        multiples(num, k);
        
    }
}
