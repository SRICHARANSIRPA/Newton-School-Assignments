// Java program to count triplets
// with difference less than k.

import java.io.*;
import java.util.*;

class Triplet {

    static int binary_lower(int value,
                            int arr[],
                            int n) {
        int start = 0;
        int end = n - 1;
        int ans = -1;
        int mid;

        while (start <= end) {
            mid = (start + end) / 2;
            if (arr[mid] >= value) {
                end = mid - 1;
                ans = mid;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }


    static int countTriplet(int arr[],
                            int n, int k) {
        int count = 0;

        // sort the array
        Arrays.sort(arr);

        // for each element from
        // index 2 to n - 1.
        for (int i = 2; i < n; i++) {

            // finding the lower
            // bound of arr[i] - k.
            int cur = binary_lower(arr[i] - k,
                    arr, n);

            // If there are at least two
            // elements between lower
            // bound and current element.
            if (cur <= i - 2) {

                // increment the count
                // by lb - i C 2.
                count += ((i - cur) *
                        (i - cur - 1)) / 2;
            }
        }
        return count;
    }

    // Driver Code
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 3};
        int k = 1;
        int n = arr.length;

        System.out.println(countTriplet(arr, n, k));
    }
}

// This code is contributed by anuj_67.
