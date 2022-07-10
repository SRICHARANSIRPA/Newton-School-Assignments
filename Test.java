import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test {

    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int[][] arr = new int[n][m];
//        arr[0][0] = 1;
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                arr[i][j] = sc.nextInt();
//            }
//        }
//
//        System.out.println("Printing the elements");
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                System.out.print(arr[i][j] + "\t");
//            }
//            System.out.println("");
//        }
//
//
//        System.out.println("arr[0][0] = " + arr[0][0]);

//        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            int item = arr[i];
            if (map.containsKey(item))
                map.replace(item, map.get(arr[i]) + 1);
            else
                map.put(arr[i], 1);

        }
        for (HashMap.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }


    }

}
