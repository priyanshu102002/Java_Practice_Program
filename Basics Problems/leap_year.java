import java.util.Scanner;
public class leap_year {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the year ");
        int year = sc.nextInt();
        if(year%4==0){
            System.out.println("It is a Leap Year");
        }
        else{
            System.out.println("It is not a Leap Year");
        }
    }
}
