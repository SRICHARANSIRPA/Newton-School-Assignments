package Search;

import java.awt.geom.RectangularShape;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int element = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int result = binary_search(arr, 0, n - 1, element);
        if (result != -1) {
            System.out.println("ELEMENT FOUND  AT INDEX" + result);
        } else {
            System.out.println("No Element Found");
        }
//        Print(arr, n);
    }

    private static int binary_search(int[] arr, int left, int right, int element) {
        if (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == element) {
                return mid;
            }
            if (arr[mid] > element) {
                return binary_search(arr, left, mid - 1, element);
            } else {
                return binary_search(arr, mid + 1, right, element);
            }
        }
        return -1;
    }

    private static void Print(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
