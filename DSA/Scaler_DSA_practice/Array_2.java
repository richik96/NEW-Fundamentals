package DSA.Scaler_DSA_practice;
//maximum subarray sum
public class Array_2 {
    public static void main(String[] args) {
        //Max sum contiguous subarray
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
//Brute force
        int n = arr.length;
        int max_sum = Integer.MIN_VALUE;
//        for(int i=0; i<n; i++) {    //i goes from 0 to n
//            for(int j=i; j<n; j++) {    //j goes from i to n
//                int sum =0;
//                for(int k=i; k<j; k++) {    //k makes the subarray for each i->j
//                    sum += arr[k];
//                    max_sum = Math.max(sum, max_sum);
//                }
//            }
//        }
//        System.out.println(max_sum);
        //optimization
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
            max_sum = Math.max(sum, max_sum);
            if (sum < 0) {
                sum = 0;
            }
        }
        System.out.println(max_sum);
    }
}
