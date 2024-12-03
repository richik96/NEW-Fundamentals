package DSA;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};


        System.out.println(Arrays.toString(reverseArray2(a)));
    }

    static int[] reverseArray(int a[]) {
        int temp[] = new int[a.length];
        for(int i=0; i<a.length; i++) {
            temp[i] = a[a.length-1-i];
        }
        return temp;
    }

    static int[] reverseArray2(int a[]) {
        int temp;
        int j = a.length-1;
        for(int i=0; i<a.length/2; i++) {
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            j--;
        }
        return a;
    }

}
