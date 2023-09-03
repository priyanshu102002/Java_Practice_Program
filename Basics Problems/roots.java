public class roots {
    public static void main(String[] args) {
        int a = 3 , b = -11 , c = -4;
        int d = ((b*b) - (4*a*c));

        if (d>0){
            double root1 = (-b + Math.sqrt(d))/(2*a);
            double root2 = (-b - Math.sqrt(d))/(2*a);

            System.out.println(root1 + " and "+root2 +" are the two roots" );
        }

    }
    
}
