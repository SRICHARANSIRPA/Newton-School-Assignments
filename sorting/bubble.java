package Sorting;

import java.util.Scanner;

public class bubble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        BubbleSort(arr);
        Print(arr, n);
    }

    private static void Print(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    private static void BubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        int k = 100;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<k;j++)
            {

            }
        }




    }
}
