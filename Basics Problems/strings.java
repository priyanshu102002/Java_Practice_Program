import java.util.*;
class strings {
    public static void main(String[] args) {
        String s = "abcd";

        for (int i = 0 ; i<s.length() ; i++){
            for (int j = i ; j<s.length() ; j++)
            System.out.print(s.substring(i,j+1)+' ');
        }
    }
}