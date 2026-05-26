import java.util.*;
import java.io.*;
public class TriangularNumber {

    public static void main(String[] args)
    {
        int num=0;
        int n=100000;
        // This is Sieve of Eratosthenes
        int[] spf = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            spf[i] = i;
        }

        for (int i = 2; i * i <= n; i++) {
            if (spf[i] == i) {
                for (int j = i * i; j <= n; j += i) {
                    if (spf[j] == j) {
                        spf[j] = i;
                    }
                }
            }
        }
        for(int i=1;i<=99999;i++)
        {
            long div=1;
            int temp=i;
            if(temp%2==0)
                temp/=2;
            while(temp!=1)
            {
                int curr=spf[temp];
                int cnt2=0;
                while(temp%curr==0)
                {
                    temp/=curr;
                    cnt2++;
                }
                div=(div*(cnt2+1));
            }
            temp=i+1;
            if(temp%2==0)
                temp/=2;
            while(temp!=1)
            {
                int curr=spf[temp];
                int cnt2=0;
                while(temp%curr==0)
                {
                    temp/=curr;
                    cnt2++;
                }
                div=(div*(cnt2+1));
            }

            if(div>500)
            {
                System.out.println(i);
                break;
            }
        }
    }
}
