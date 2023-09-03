import java.util.*;

public class toggle{

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter your string: ");
        StringBuilder str = new StringBuilder(sc.nextLine());

        for(int i = 0 ; i<str.length() ; i++){

            boolean flag = true; //Let it is a Capital letter
            char ch = str.charAt(i);
            int asci = (int)ch;

            if(asci>=97) flag=false; //Small letter

            if(flag==true){
                asci+=32;
                char dh = (char)asci;
                str.setCharAt(i,dh);

            }

            else{
                asci-=32;
                char dh = (char)asci;
                str.setCharAt(i,dh);
            }
        }

        System.out.print("Result is: ");
        System.out.println(str);
    }

}