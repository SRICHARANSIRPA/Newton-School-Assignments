import java.util.Scanner;

public class ZAlgo {

    public static void searchForPattern(String text, String pattern) {
        String concat = pattern + "$" + text;
        int n = concat.length();
        int[] Z = getZarr(concat);

        for (int i = 0; i < n; ++i) {
            if (Z[i] == pattern.length()) {
                System.out.println("Pattern found at index "
                        + (i - pattern.length() - 1));
            }
        }
    }

    private static int[] getZarr(String str) {

        int n = str.length();
        int[] Z = new int[n];

        int L = 0, R = 0;

        for (int i = 1; i < n; ++i) {

            if (i > R) {
                L = R = i;
                while (R < n && str.charAt(R - L) == str.charAt(R))
                    R++;
                Z[i] = R - L;
                R--;
            } else {
                int k = i - L;

                if (Z[k] < R - i + 1)
                    Z[i] = Z[k];

                else {
                    L = i;
                    while (R < n && str.charAt(R - L) == str.charAt(R))
                        R++;

                    Z[i] = R - L;
                    R--;
                }
            }
        }
        return Z;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String txt = sc.nextLine();
        String ptn = sc.nextLine();
        searchForPattern(txt, ptn);

    }
}
