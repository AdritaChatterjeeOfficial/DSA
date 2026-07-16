public class LinearSearch {
    public static int search(int arr[], int key){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1, 5, 3, 99, 23, 290, 89};
        int key = 3;

        int index = search(arr, key);
        if(index == -1){
            System.out.println("Key not found.");
        } else {
            System.out.println("Key is found at index "+ index);
        }
    }
}
