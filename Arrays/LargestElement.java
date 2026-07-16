public class LargestElement {
    public static void largest(int arr[]){
        int largest = arr[0];
        for(int i=1; i<arr.length; i++){
            if(largest < arr[i]){
                largest = arr[i];
            }
        }
        System.out.println(largest);
    }
    public static void main(String[] args) {
        int arr[] = {100, 2, 4, 45, 12, 43};
        largest(arr);
    }
}
