public class initializing2dArray {
    public static void main(String[] args) {
        int[][] a = {{1,2,3},{4,2,3},{55,6,22,2}};
        for(int i = 0 ; i<a.length ; i++){
            for(int j = 0 ; j<a.length ; j++)
            System.out.print(a[i][j]+" ");
            System.out.println();
        }
    }
}
