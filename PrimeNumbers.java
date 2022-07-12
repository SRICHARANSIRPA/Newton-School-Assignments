import java.util.Scanner;

public class PrimeNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        FindIsPrime(n);
        FindIsPrimeUsingSquareRoot(n);
    }

    private static void FindIsPrimeUsingSquareRoot(int n) {
        boolean flag = false;
        System.out.println("Square root of n: " + Math.sqrt(n));
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                flag = true;
                break;
            }
        }
        if (flag)
            System.out.println("This is not a prime Number");
        else
            System.out.println("This is a prime Number");
    }


    private static void FindIsPrime(int n) {

        boolean flag = false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                flag = true;
                break;
            }
        }
        if (flag)
            System.out.println("This is not a prime Number");
        else
            System.out.println("This is a prime Number");
    }
}
