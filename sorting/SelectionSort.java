package Sorting;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Selection_Sort(arr);
        Print(arr, n);
    }

    private static void Print(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    private static void Selection_Sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int min_index = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = tmp;
        }
    }
}
