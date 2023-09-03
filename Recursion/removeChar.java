import java.util.Scanner;

public class removeChar {
    public static String removeA(String s , int idx){

        // Base Case
        if(idx == s.length()){
            return " ";
        }

        // Recursive Work
        String smallAns = removeA(s,idx+1);


        char currentElement = s.charAt(idx); 

        // Self Work
        if(s.charAt(idx) != 'a'){
            return currentElement+smallAns;
        }
        else{
            return smallAns;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s = sc.nextLine();

        System.out.println(removeA(s, 0));

    }
}



// int temp = arr[j];
// arr[j] = arr[j+1];
// arr[j+1] = temp;