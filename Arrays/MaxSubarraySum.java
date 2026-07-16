public class MaxSubarraySum {

    // Brute Force Approach
    public static void maxSubArrSumBruteForce(int arr[]){
        int currSum = 0, maxSum = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            int start = i;
            for(int j=i; j<arr.length; j++){
                int end = j;
                currSum = 0;
                for(int k=start; k<=end; k++){
                    currSum += arr[k];
                }
                if(currSum > maxSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max subarray sum = " + maxSum);
    }

    // Prefix Sum Approach
    public static void maxSubArrSumPrefixSum(int arr[]){
        int currSum = 0, maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        //Calculate prefix array
        for(int i=1; i<prefix.length; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        for(int i=0; i<arr.length; i++){
            int start = i;
            for(int j=i; j<arr.length; j++){
                int end = j;
                currSum = start==0 ? prefix[end] : prefix[end] - prefix[start-1];
                
                if(currSum > maxSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max subarray sum = " + maxSum);
    }

    // Kadane's Algorithm
    public static void maxSubArrSumKadanesAlgo(int arr[]){
        int cs = 0, ms =Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            cs = cs + arr[i];
            ms = Math.max(ms, cs);
            if(cs < 0){
                cs = 0;
            }
        }
        System.out.println("Max subarray sum = " + ms);
    }

    public static void main(String[] args) {
        //int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        int arr[] = {-1, -2, -3};
        maxSubArrSumKadanesAlgo(arr);
    }
}
