import java.util.Scanner;

public class MatrixStringMatching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] arr = new char[n][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.next().charAt(0);
            }
        }
        String s = sc.nextLine();
        int i = 0;
        while (i < s.length()) {
            int l = i;
            int r = n - 1 + i;
            String str = s.substring(l, r);
            if(!Check(arr,str,n,m))
            {
                System.out.println("NOT FOUND");
                break;
            }
            i = r + 1;
        }

    }

    public static boolean Check(char[][] arr, String s, int n, int m) {
        for (int i = 0; i < n && i < s.length(); i++) {
            boolean flag = false;
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == s.charAt(i)) {
                    flag = true;
                    arr[i][j] = '\0';
                    break;
                }
            }
            if (!flag)
                return false;
        }
        return true;
    }

}
