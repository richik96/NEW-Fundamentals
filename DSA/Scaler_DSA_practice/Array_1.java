package DSA.Scaler_DSA_practice;

import java.util.Arrays;

public class Array_1 {
    public static void main(String[] args) {
        //Find the equilibrium index of the array {1,2,6,4,0,-1}
        //index i = equilibrium index then left sum of i = right sum of i

        int[] arr = {1,2,6,4,0,-1};

        int[] sum = new int[arr.length];
        sum[0] = arr[0];
        for(int i=1; i<arr.length; i++) {
            sum[i] = sum[i-1] + arr[i];
        }
        System.out.println("Equilibrium index for " + Arrays.toString(arr) + " is : " +arrCheck(arr, sum));
    }

    static int arrCheck(int[] arr, int[] sum) {
        int n = arr.length;
        if(n == 1) {
            return arr[0];
        }
        else if (n == 2) {
            throw new RuntimeException("index cannot be found");
        }
        for(int i=1; i<n-1; i++) {
            int left_sum = sum[i] - arr[i];
            int right_sum = sum[n-1] - sum[i];
            if(left_sum == right_sum) {
                return i;
            }
        }
        return -1;
    }
}
