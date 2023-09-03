public class insertionSort {

    public static void insertion(int[] arr){

        for(int i = 1; i<arr.length ; i++){
            int j = i;
                while(j>0 && arr[j-1]>arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    j--;
                }
        }
    }
    public static void main(String[] args) {
        int[] arr = {8,3,1,5,2};

        insertion(arr);
        for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
