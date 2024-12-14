package DSA;
// given an array of integers, find the maximum sum of k consecutive elements
// input: [1, 2, 3, 4, 5, 6, 7, 8, 9], k = 3
// output: 24 = 7+8+9
//3 sum
public class SlidingWindow {

    public static void main(String[] args) {
        int[] arr = {9, 12, 32, 3, 8, 10};
        int k = 3;      //k = number of consecutive elements for which we need the max sum
        maxSum(arr, k);
    }

    static void maxSum(int[] a, int k) {
        int currSum = a[0];

        if(a.length < k) {
            System.out.println("Invalid input");
            return;
        }

        for(int i=1; i<k;i++){
            currSum += a[i];
        }

        int maxSum = currSum;

        for(int i=k; i<a.length; i++) {
            currSum = currSum + a[i] - a[i-k];
            maxSum = Math.max(maxSum, currSum);
        }

        System.out.println("The maximum sum is: " +maxSum);
    }
}
