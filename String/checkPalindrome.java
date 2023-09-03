public class checkPalindrome {

    public static void main(String[] args) {
        String str = "abcba";
        boolean flag = true;
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                flag = false;
                break;
            }
            i++;
            j--;
        }
        
        if (flag == true) {
            System.out.println("palindrome");
        } else {
            System.out.println("not Palindrome");
        }
    }
}
