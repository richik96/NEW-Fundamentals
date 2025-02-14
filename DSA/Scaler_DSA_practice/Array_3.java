package DSA.Scaler_DSA_practice;
//sum of all subarray

public class Array_3 {
    public static void main(String[] args) {

        int[] arr = {1,2,6,4,0,-1};
        int n = arr.length;

        int totalSum = 0;
        for(int i=0; i<n; i++) {
            int contribute = arr[i] * (n-i);
            totalSum = contribute + totalSum;
        }
        System.out.println("Sum of all SubArrays = " +totalSum);
    }
}
