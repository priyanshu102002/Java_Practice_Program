import java.util.Scanner;
public class firstRepeat {
    public static int repeat(int[] arr){
        int n = arr.length;
        int ans = -1;
        for(int i = 0 ; i<n ; i++){
            for(int j = i+1 ; j<n ; j++){
                if(arr[i]==arr[j]){
                    ans=arr[i];
                    return ans;
                }
            }
        }
        return ans;
    }

   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of array ");
    int n = sc.nextInt();
    int[] arr = new int[n];

    System.out.println("Enter "+n+" element ");
    for(int i = 0 ; i<n ; i++){
        arr[i] = sc.nextInt();
    }

    System.out.println(repeat(arr));
    
    }

}
