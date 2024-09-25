//package DSA;

public class RecursiveBinary {

    public static void main(String[] args) {
        
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int key = 5;
        int result = binarySearch(arr, 0, arr.length - 1, key);
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }

    static int binarySearch(int arr[],int left, int right, int target) {

        while(left <= right) {

            int mid = (left + right) / 2;
            if(arr[mid] == target) {
                return mid;
            } 
            else if(arr[mid] < target) {
                return binarySearch(arr, mid + 1, right, target);
            } 
            else {
                return binarySearch(arr, left, mid - 1, target);
            }
            //return -1;
        }
        return -1;
    }
}
