package DSA.Scaler_DSA_practice;

public class InfiniteArraySearch {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13}; //goes till infinity
        //search the target in the sorted array that goes till infinity

        int target = 11;
        int start = 0;
        int end = 1;
        if(end < target) {
            int temp = end;
            end = end + (end-start+1)*2;
            start = temp;
        }
        System.out.println(bSearch(arr, target, start, end));
    }
    static int bSearch(int[] arr, int target, int start, int end) {
        while(start <= end) {
            int mid = (start + end)/2;
            if(arr[mid] == target)
                return mid;
            if(target > arr[mid])
                start = mid+1;
            else
                end = mid-1;
            return bSearch(arr, target, start, end);
        }
        return -1;
    }
}
