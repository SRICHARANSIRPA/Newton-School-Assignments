package Sorting;

import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        MergeSortMethod(arr, n);
        Print(arr, n);
    }

    private static void MergeSortMethod(int[] arr, int n) {
        merge_sort(arr, 0, n - 1);
    }

    private static void merge_sort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            merge_sort(arr, left, mid);
            merge_sort(arr, mid + 1, right);
            merge_method(arr, left, mid, right);

        }
    }

    private static void merge_method(int[] arr, int left, int mid, int right) {
        int n = mid - left + 1;
        int m = right - mid;

        int a[] = new int[n];
        int b[] = new int[m];

        for (int i = 0; i < n; i++) {
            a[i] = arr[left + i];
        }
        for (int i = 0; i < m; i++) {
            b[i] = arr[mid + i + 1];
        }
        //merge part
        int k = left;
        int i = 0 , j =0;
        while(i<n && j<m)
        {
            if(a[i]<b[j])
            {
                arr[k++] = a[i++];
            }
            else {
                arr[k++] = b[j++];
            }
        }

        while(i<n)
        {
            arr[k++] = a[i++];
        }
        while(j<m)
        {
            arr[k++] = b[j++];
        }

    }


    private static void Print(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

}
