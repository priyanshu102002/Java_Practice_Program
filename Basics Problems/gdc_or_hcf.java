public class gdc_or_hcf {
    public static void main(String[] args) {
        int a = 81 , b= 153;
        for(int i = 1 ; i<=a && i<=b ; i++){
            if(a>b){
                a=a-b;
            }
            if(b>a){
                b=b-a;
            }
        }
        System.out.println(a);
    }
}
