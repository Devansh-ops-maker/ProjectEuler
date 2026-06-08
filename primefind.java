import java.util.*;
import java.io.*;
public class primefind {
    public static void main(String [] args)
    {
        int N = 120900;
        int[] spf = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            spf[i] = i;
        }

        spf[0] = 0;
        spf[1] = 1;
        int cnt=0;
        for (int i = 2; i * i <= N; i++) {
            if (spf[i] == i) {
                for (int j = i * i; j <= N; j += i) {
                    if (spf[j] == j) {
                        spf[j] = i;
                    }
                }
            }
        }
       for (int i=2;i<=N;i++)
       {
           if(spf[i]==i)
           {
               cnt++;
               if(cnt==10001)
               {
                   System.out.println(i);
                   break;
               }
           }
       }
    }
}
