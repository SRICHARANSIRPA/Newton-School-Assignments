import java.util.Scanner;

public class PrintingElementsUsingRecursion {
    public static void main(String[] args) {
        System.out.println("Enter the value n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
    }

    private static void print(int n) {
        if(n==0)
            return;
        print(n-1);
        System.out.println(n);
    }
}
