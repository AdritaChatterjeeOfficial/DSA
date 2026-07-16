public class FirstOccurance {
    public static int firstOccur(int arr[], int i, int key){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstOccur(arr, i+1, key);
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 8, 4, 5, 8, 4};
        int key = 4;
        System.out.print(firstOccur(arr, 0, key));
    } 
}
