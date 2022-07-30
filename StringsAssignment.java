import java.util.Scanner;

public class StringsAssignment {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        StringBuilder str = new StringBuilder();

        String str = sc.next();
//        str.append("abvudb");

        System.out.println(str);

        for(int i=0;i<str.length();i++)
        {
            System.out.println(str.charAt(i));
        }

    }
}
