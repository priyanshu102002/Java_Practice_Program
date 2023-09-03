public class Swap_of_two_number {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        System.out.println("The value of a is "+a);
        System.out.println("The value of b is "+b);

        int c = a;
        a=b;
        b=c;
        System.out.println("The value of a becomes "+a);
        System.out.println("The value of b becomes "+b);
    }
}
