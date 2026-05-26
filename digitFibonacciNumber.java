import java.util.*;
import java.io.*;
public class digitFibonacciNumber {
    public static void main(String[] args)
    {
        String s1="1";
        String s2="1";
        boolean flag=false;
        int indx=3;
        while(!flag)
        {
            String ans=addStrings(s1,s2);
            s1=s2;
            s2=ans;
            if(ans.length()==1000)
            {
                flag=true;
                break;
            }
            indx++;
        }
        System.out.println(indx);
    }
    public static String addStrings(String num1, String num2) {
        StringBuilder ans = new StringBuilder();

        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {
            int d1 = (i >= 0) ? num1.charAt(i) - '0' : 0;
            int d2 = (j >= 0) ? num2.charAt(j) - '0' : 0;

            int sum = d1 + d2 + carry;

            ans.append(sum % 10);
            carry = sum / 10;

            i--;
            j--;
        }

        return ans.reverse().toString();
    }
}

