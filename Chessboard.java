import java.util.Scanner;

public class Chessboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[][] arr = new boolean[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextBoolean();
            }
        }
        int count = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (Shouldchange(arr, i, j)) {
                    arr[i][j] = !arr[i][j]; // 1
                    count++;
                }
            }
        }

        System.out.println("min number of changes are" + count);

    }

    public static boolean Shouldchange(boolean[][] arr, int i, int j) {
        int n = 3;
        if (i == 0) {
            if (j == 0) {
                return (arr[i][j] == arr[i][j + 1] && arr[i][j] == arr[i + 1][j]);
            }
            if(j==n-1)
            {
                return (arr[i][j] == arr[i][j-1] && arr[i][j] == arr[i + 1][j]);
            }
            return (arr[i][j] == arr[i][j - 1] && arr[i][j] == arr[i][j + 1] && arr[i][j] == arr[i + 1][j]);
        }

        if (j == 0) {
            if (i == n - 1) {
                return (arr[i][j] == arr[i][j + 1] && arr[i][j] == arr[i - 1][j]);
            }
            return (arr[i][j] == arr[i][j + 1] && arr[i][j] == arr[i + 1][j] && arr[i][j] == arr[i - 1][j]);
        }
        if (i == n - 1) {
            if (j == n - 1) {
                return (arr[i][j] == arr[i][j - 1] && arr[i][j] == arr[i - 1][j]);
            }
            return (arr[i][j] == arr[i][j + 1] && arr[i][j] == arr[i - 1][j]);
        }

        if (j == n - 1) {
            return (arr[i][j] == arr[i][j - 1] && arr[i][j] == arr[i - 1][j]);
        }


        return (arr[i][j] == arr[i][j - 1] && arr[i][j] == arr[i][j + 1] && arr[i][j] == arr[i + 1][j] && arr[i][j] == arr[i - 1][j]);
    }

}
