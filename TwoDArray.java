import java.util.Scanner;

public class TwoDArray {

    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter row and column");
        int row = sc.nextInt();
        int column = sc.nextInt();

        int[][] arr = new int[row][column];


        System.out.println("Enter elements");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < row; i++) {
            int sum = 0;
            for (int j = 0; j < column; j++) {
                System.out.print(arr[i][j] + "\t");
                sum+=arr[i][j];
            }
            System.out.println("SUM OF all elements in row:"+i+"="+sum);
        }

        System.out.println("Elements as Transpose");
        for (int c = 0; c < column; c++) {
            int sum = 0;
            for (int r = 0; r < row; r++) {
                System.out.print(arr[r][c] + "\t");
                sum+=arr[r][c];
            }
            System.out.println("SUM OF all elements in column:"+c+"="+sum);
        }
    }

}
