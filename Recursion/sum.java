package recursion;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int _sum = Sum(arr, 0);
        System.out.println(_sum);
    }

    private static int Sum(int[] arr, int i) {
        if (i >= arr.length)
            return 0;
        int remaining_sum = Sum(arr, i + 1);
        return arr[i] + remaining_sum;

    }
}
