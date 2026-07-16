public class BinarySearch {
    public static int binarySearch(int arr[], int key){
        int start = arr[0], end = arr.length-1;
        while (start<=end) {
            int mid = start + (end - start) / 2;    
            if(arr[mid] == key){
                return mid;
            }
            else if(arr[mid] > key){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }    
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1, 11, 22, 33, 44, 55, 77, 88, 99, 1000};
        int key = 22;
        System.err.println(binarySearch(arr, key));
    }
}
