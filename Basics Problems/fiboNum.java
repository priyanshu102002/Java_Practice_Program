public class fiboNum {
    public static void fibonumber(int n) {
        int f = 0;
        int s = 1;
        int i =1;
        int count = 0;
        while(i <=n){
            int thirdnum = f+s;
            f=s;
            s=thirdnum;
            if(thirdnum==n){
                count++;
            }
            
            i++;
        }
        if (count>=1){
            System.out.println("True");
        }
        else{
            System.out.println(false);
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibonumber(n);
        // int f = 0;
        // int s = 1;
        // int i =1;
        // int count = 0;
        // while(i <=n){
        //     int thirdnum = f+s;
        //     f=s;
        //     s=thirdnum;
        //     if(thirdnum==n){
        //         count++;
        //     }
            
        //     i++;
        // }
        // if (count>=1){
        //     System.out.println("True");
        // }
        // else{
        //     System.out.println(false);
        // }
    }
}
