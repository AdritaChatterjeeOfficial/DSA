public class LastOccurance {
    public static int lastOccur(int arr[], int i, int key){
        if(i==arr.length){
            return -1;
        }
        int isFound = lastOccur(arr, i+1, key);
        if(isFound==-1 && arr[i] == key){
            return i;
        }
        return isFound;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 8, 4, 5, 8, 4};
        int key = 4;
        System.out.print(lastOccur(arr, 0, key));
    } 
}
