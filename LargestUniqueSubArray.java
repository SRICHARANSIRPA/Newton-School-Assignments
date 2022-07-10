import java.util.HashMap;
import java.util.Scanner;

public class LargestUniqueSubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value n");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Array Values ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        int i = 0, j = 0;

        int max_value = -100;

        while (i < n) {
            map.put(arr[i], 1);  // To Insert in to the Map
            j = i + 1;   // to place j pointer to the right of the i
            while (j < n) {
                if (map.containsKey(arr[j])) {
                    max_value = Integer.max(max_value, j - i);  // to take the max value from the previous and current suarray
                    break;
                } else {
                    map.put(arr[j], 1);
                }
                j++;
            }
            if (j == n) {
                max_value = Integer.max(max_value, j - i);
            }
            i++;
            map.clear();
        }

        System.out.println("Largest Subarray Length:" + max_value);
    }
}
