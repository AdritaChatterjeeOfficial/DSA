// Given an integer array nums,
// return true if any value appears at least twice in the array,
// and return false if every element is distinct.


import java.util.HashSet;
public class DistinctElement {
    public static boolean findTwiceElement(int arr[]){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<arr.length; i++){
            if(set.contains(arr[i])){
                return true;
            } else {
                set.add(arr[i]);
            }
        }
        return false;
    }

    
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 1};  //True
        int arr1[] = {1, 2, 3, 4};  //False
        int arr2[] = {1, 2, 3, 3, 3, 1, 2};  //True
        System.out.println(findTwiceElement(arr));
        System.out.println(findTwiceElement(arr1));
        System.out.println(findTwiceElement(arr2));
    }
}
