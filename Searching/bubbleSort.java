public class bubbleSort {

    public static void swap(int[] arr , int a , int b ){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    // public static void bubble(int[] arr) {
    //     for(int i = 0 ; i<arr.length-1 ; i++){
    //         for(int j = 0 ; j<arr.length-i-1 ; j++){
    //             if(arr[j]>arr[j+1]){
    //                 swap(arr,j,j+1);
    //             }
    //         }
    //     }
    // }

    
    // More Optimized code
    public static void bubble(int[] arr) {
        for(int i = 0 ; i<arr.length-1 ; i++){
            boolean flag = false;
            for(int j = 0 ; j<arr.length-i-1 ; j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                    flag = true;
                }
            }
            if (flag == false){
                return;
            }
        }
    }

    public static void main(String[] args) {
        int [] arr = {2,1,3,4,5};
        bubble(arr);
        for(int i = 0; i<arr.length ; i++){
            System.out.println(arr[i]);
        }
    }
}
