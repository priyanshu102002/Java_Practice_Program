public class pattern1 {
    public static void main(String[] args) {
        int n = 4 ;
        int i = 1 ;
        while (i<=n){
            int j = 1 ;
            while(j<=n){
                System.out.print("*");
                j+=1;
            }
            System.out.println();
            i+=1;
        }

    }
}
