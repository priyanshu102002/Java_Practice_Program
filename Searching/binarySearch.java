public class binarySearch {
    public static int binarySearchnumber(int[] arr, int x) {
        int s = 0;
        int e = arr.length-1;

        while(s<=e){
            int mid = (s+e)/2;

            if (arr[mid] >x){
                e = mid -1;
            }
            else if (arr[mid]<x){
                s = mid +1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,5,7,8,12,16,100};
        int index = binarySearchnumber(arr, 7);
        System.out.println("The index is "+index);
    }
}



