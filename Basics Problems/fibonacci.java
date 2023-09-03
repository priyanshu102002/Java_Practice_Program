public class fibonacci {
    public static void main(String[] args) {
        int firstTerm = 0 , secondTerm = 1 , numberOfTerm = 10 ;
        for(int i=firstTerm ; i<=numberOfTerm ; i++){
            System.out.println(secondTerm+firstTerm);
            firstTerm = secondTerm;
            secondTerm = firstTerm+secondTerm;
        }
    }
}
