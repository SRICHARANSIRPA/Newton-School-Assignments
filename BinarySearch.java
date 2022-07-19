import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to find");
        int k = sc.nextInt();

//        FindElement(arr, 0, n - 1, k);
        FindElementUsingRecursion(arr, 0, n - 1, k);
    }

    private static void FindElement(int[] arr, int left, int right, int k) {

        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] == k) {
                System.out.println("Element found at Index :" + mid);
                break;
            } else if (arr[mid] < k) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

    }

    private static void FindElementUsingRecursion(int[] arr, int left, int right, int k) {
        if (left > right) {
            System.out.println("No Element found int he array");
            return;
        } else {
            int mid = (left + right) / 2;
            if (arr[mid] == k) {
                System.out.println("Element found at Index :" + mid);
                return;
            } else if (arr[mid] < k) {
                FindElementUsingRecursion(arr, mid + 1, right, k);
            } else {
                FindElementUsingRecursion(arr, left, mid - 1, k);

            }
        }

    }
}
