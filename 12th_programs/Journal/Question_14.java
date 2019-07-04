package Journal;

import java.io.*;
public class Question_14
{
    public static boolean unique (int x)  
    {
        String s = Integer.toString (x); 
        boolean flag = true;  
        int i, j;
        for (i = 0; i < s.length (); i++)
        {
            for (j = i+1; j < s.length (); j++)
            {
                if(s.charAt (j) == s.charAt (i)) 
                {
                    flag = false; 
                    break;
                }      
            }
        }
        return flag;
    }

    public static void main (String args []) throws IOException 
    {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        System.out.println ("Enter lower limit : ");
        int m = Integer.parseInt (br.readLine ()); 
        System.out.println ("Enter upper limit : ");
        int n = Integer.parseInt (br.readLine ());
        int l = n-m+1;
        if ((m < n) && (m < 30000) && (n < 30000))
        {
            int un [] = new int [l]; 
            int prime [] = new int [l]; 
            boolean flag = true, pr;
            int i, j = 0, k = 0, p, cnt1 = 0, cnt2 = 0;
            for (i = m; i <= n; i++)
            {
                flag = unique (i); 
                if (flag == true)  
                {
                    un [j++] = i; 
                    cnt1 ++;
                    pr = true;
                    for (p = 2; p < i; p++)
                    {
                        if (i % p == 0)
                        {
                            pr = false;
                            break;
                        }
                    }
                    if (pr == true && i > 1) 
                    {
                        prime [k++] = i;   
                        cnt2 ++; 
                    }
                }
            }
            if (cnt1 != 0) 
            {
                System.out.println ("The no of unique numbers : " + cnt1);
                for(i = 0; i < cnt1; i++)
                    System.out.println (un [i]); 
                System.out.println("The number of unique prime numbers : " + cnt2); 
                for(i = 0; i < cnt2; i++)
                    System.out.println (prime [i]); 
            }     
        }
        else 
            System.out.println ("INVALID INPUT");
    }
}
