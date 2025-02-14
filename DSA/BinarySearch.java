package DSA;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 5;
        int result = binarySearch(arr, target);
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int steps = 0;
        while (start <= end) {
            steps++;
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                System.out.println("Steps taken for binary : " +steps);
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        System.out.println("Steps taken for binary : " +steps);
        return -1;
        
    }
}
