public class pattern8 {
    public static void main(String[] args) {
        int p = 1;
        int n = 4;
        int i = 1;
        while(i<=n){
            int j = 1;
            while(j<=i){
                System.out.print(p);
                p++;
                j++;
            }
            System.out.println();
            i++;
        }
        
    }
}
