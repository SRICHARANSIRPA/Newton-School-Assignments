import java.util.Scanner;

public class TwoPointer {
    public static void main(String... args) {

        //x = 10
        //[2,4,6,8,9] => sum(6,4)=100
        //two pointers to find the target sum


        Scanner sc = new Scanner(System.in);

        // Given array need to pick two elements in the array whose sum is equal to target.

        System.out.println("Enter Target sum");
        int target = sc.nextInt();

        System.out.println("Enter Length of array ");
        int n = sc.nextInt();  // length of the array.

        System.out.println("Enter array elementts ");
        int[] arr = new int[n]; // creating array of length n dynamically

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // taking the input of the array element from user.
        }

        int p1 = 0, p2 = n - 1;

        while (p1 < p2) {

            int sum = arr[p1] + arr[p2];

            if (sum == target) // condition satisfies only when two elements sum is equal to target.
            {
                System.out.println(" element 1:" + arr[p1]);
                System.out.println("element 2 :" + arr[p2]);
                p1++;
                p2--;
            } else if (sum < target) {
                p1++;  // to increase the sum  moving the left pointer to right side by 1 length
            } else {
                p2--; // to decrease the sum moving the right pointer to left side by 1 length
            }
        }

    }

}
