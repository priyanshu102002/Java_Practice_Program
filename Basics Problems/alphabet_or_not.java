import java.util.Scanner;

public class alphabet_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Character : ");

        // char ch = sc.next().charAt(0);
        // int castAscii = (int)ch;

        // if (castAscii==65 || castAscii==69 || castAscii==73 || castAscii==79 ||
        // castAscii==85 ||castAscii==97 || castAscii==101 || castAscii==105 ||
        // castAscii==111 || castAscii==117){
        // System.out.println("It is a vowel");
        // }
        // else{
        // System.out.println("It is a Consonant");
        // }

        char cha = sc.next().charAt(0);

        if (cha == 'a' || cha == 'e' || cha == 'i' || cha == 'o' || cha == 'u' || cha == 'A' || cha == 'E' || cha == 'I'
                || cha == 'O' || cha == 'U') {
            System.out.println("It is a vowel");
        } else {
            System.out.println("It is a Consonant");
        }
    }
}
