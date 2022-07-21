import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sort(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    private static void sort(int[] arr, int n) {
        //bubble sort<n-1
        for (int i = 0; i<n-1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                    if(arr[j]>arr[j+1])
                    {
                        //swap two values
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
            }
        }
    }
}
