import java.util.Scanner;

public class palindromStringCheck {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for(int i = 0 ; i<5 ; i++){
            arr[i] = i+1;
        }
        pa(arr,0);
    }

    public static void pa(int[] arr,int idx){
        if(idx == arr.length){
            return;
        }
        pa(arr,idx+1);
        System.out.println(arr[idx]);
    }
}
