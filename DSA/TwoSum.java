import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {
        int[] arr = {2, 7, 9, 11, 15};
        int target = 16;

        //int[] result = twoSum(arr, target);
        int[] result = mapTwoSum(arr, target);
        System.out.println("The indexs are : " +result[0] + "," +result[1]);
    }

    static int[] twoSum(int[]a, int target) {

        int n = a.length;
        for( int i =0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                if(a[i] + a[j] == target) {
                    return new int[]{i,j};
                }
            }
        }
        throw new IllegalArgumentException("no solution");
    }

    static int[] mapTwoSum(int[]a, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();        //key = actual value, value = index of the value
        for (int i = 0; i < a.length; i++) {
            int complement = target - a[i];         //complement = 16-2 = 14
            if (map.containsKey(complement)) {      //checks the hashmap for 14 key
                return new int[]{map.get(complement), i};
            }
            map.put(a[i], i);                       //adds the last key to the map
        }
        throw new IllegalArgumentException("no solution");
    }
}
