import java.util.Scanner;

public class KMPStringMatching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String txt = sc.nextLine();
        String ptn = sc.nextLine();
        KMPStringMatchingAlgo(txt, ptn);

    }

    public static void KMPStringMatchingAlgo(String txt, String ptn) {

        int m = ptn.length();
        int n = txt.length();

        int[] lps = new int[m];
        CalculateLPS(lps, m, ptn);

        int i = 0;
        int j = 0;
        lps[0] = 1;

        while (i < n) {
            System.out.println("Hi");

            if (ptn.charAt(j) == txt.charAt(i)) {
                j++;
                i++;
            }
            if (j == m) {
                System.out.println("String Pattern Found at Index :" + (i - j));
                break;
            }
            else if (i < n && ptn.charAt(j) != txt.charAt(i)) {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i = i + 1;
                }
            }
        }
    }

    private static void CalculateLPS(int[] lps, int m, String ptn) {

        int j = 0;
        int i = 1;
        lps[0] = 1;

        while (i < m) {
            System.out.println("HEllo");
            if (ptn.charAt(i) == ptn.charAt(j)) // if both the character matches
            {
                lps[i] = j + 1;
                j++;
                i++;
            } else { // if not matches
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    lps[i] = j;
                    i++;
                }
            }
        }

    }

}
