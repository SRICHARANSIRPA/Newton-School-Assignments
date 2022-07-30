import java.util.Scanner;

public class SeiveOfEratosis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        GetPrimeCount(n);

    }

    public static void GetPrimeCount(int n) {
        boolean[] seive = new boolean[n + 1];
        for(int i=0;i<=n;i++)
            seive[i]=true;

        for(int i=2;i<Math.sqrt(n);i++)
        {
            if(seive[i])
            {
                for(int j=2*i;j<=n;j=j+i)
                {
                    seive[j]=false;
                }
            }
        }
        int c= 0;
        for(int i=2;i<=n;i++)
        {
            if(seive[i])
            {
                System.out.println("i :"+i +" value: "+seive[i]);
                c++;
            }
        }
        System.out.println("Count of Primes till n :"+c);

    }

}
