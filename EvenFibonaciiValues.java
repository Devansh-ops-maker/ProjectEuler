import java.util.*;
import java.io.*;
public class EvenFibonaciiValues {
    public static void main(String[] args)
    {
        long sum=2;
        int curr1=1;
        int curr2=2;
        while(curr2<=4000000)
        {
            int now=curr1+curr2;
            curr1=curr2;
            curr2=now;
            if(now%2==0)
                sum+=curr2;
        }
        System.out.println(sum);
    }
}
