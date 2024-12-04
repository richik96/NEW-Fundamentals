package DSA;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int key = 5;
        int result = binarySearch(arr, key);
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }

    static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        int steps = 0;
        while (low <= high) {
            steps++;
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                System.out.println("Steps taken for binary : " +steps);
                return mid;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println("Steps taken for binary : " +steps);
        return -1;
        
    }
}
