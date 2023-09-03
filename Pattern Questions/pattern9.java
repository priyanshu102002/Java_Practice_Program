public class pattern9 {
    public static void main(String[] args) {
        int i = 1;
        int n = 4;
        while(i<=n){
                int j = 1;
                while(j<=n){
                        System.out.print((char)('A'+j-1));
                        j++;
                }
                System.out.println();
                i++;
        }
        
    }
}
