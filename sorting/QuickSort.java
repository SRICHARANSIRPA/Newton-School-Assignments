package Sorting;

import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        quick_sort(arr, 0, n - 1);
        Print(arr, n);
    }

    private static void quick_sort(int[] arr, int left, int right) {
        if (left < right) {
            int partition = partition(arr, left, right);
            quick_sort(arr, left, partition - 1);
            quick_sort(arr, partition + 1, right);
        }
    }

    private static int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, right);
        return i + 1;
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[j];
        arr[j] = arr[i];
        arr[i] = tmp;
    }


    private static void Print(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
