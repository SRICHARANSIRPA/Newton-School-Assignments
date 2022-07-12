import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter the value n");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(factorial(n));
    }

    public static int factorial(int n) {
        if (n == 1)
            return 1;
        int pre = factorial(n - 1);
        return pre * n;
    }
}
