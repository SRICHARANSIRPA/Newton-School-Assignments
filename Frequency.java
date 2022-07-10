import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Frequency {

    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(); // Creating the Hashmap


        // First Repeated Element in the array from the start
//        for (int i = 0; i < n; i++) {
//            int item = arr[i];
//            if (map.containsKey(item)) {
//                System.out.println("First Repeated Element element :" + item);
//                break;
//            } else {
//                map.put(item, 1);
//            }
//        }

        // First Repeated Element in the array from the End

        for(int i=n-1;i>=0;i--)
        {
            int item = arr[i];
            if(map.containsKey(item))
            {
                System.out.println("First Repeated element from the End :"+item);
                break;
            }
            else {
                map.put(item,1);
            }
        }



    }

}
