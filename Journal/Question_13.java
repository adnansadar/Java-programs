package Journal;

import java.io.*;
public class Question_13
{
    public static boolean isPrime (int n)
    {
        boolean pr = true;
        if (n > 1)
        {    
            for (int i = 2; i < n; i ++)
            {
                if (n % i == 0)
                {
                    pr = false;
                    break;
                }
            }
            if (pr == true)
                return true;
            else
                return false;
        }
        else
            return false;
    }

    public static void main (String args []) throws IOException
    {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        System.out.println ("Enter n : ");
        int n = Integer.parseInt (br.readLine ());
        int a [] = new int [n];
        int i, j, k, m = 0, c = 0;
        System.out.println ("Enter array elements : ");
        for (i = 0; i < n; i++)
            a [i] = Integer.parseInt (br.readLine ());
        System.out.println ("The original array is : ");
        for (i = 0; i < n; i++)
            System.out.print (a [i] + " ");  
        for (i = 0; i < n; i++)
        {
            for (j = i+1; j < n; j++)
            {
                if (a [i] == a [j])
                {
                    for (k = j; k < n-1; k++)
                        a [k] = a [k+1];
                    n--;
                    j--;
                }
            }
        }
        for (i = 0; i < n; i++)
        {
            if (isPrime (a [i]))
                c++;
        }
        int prime [] = new int [c]; 
        for (i = 0; i < n; i++)
        {
            if (isPrime (a [i]))
            {
                prime [m++] = a [i];
                for (k = i; k < n-1; k++)
                    a [k] = a [k+1];
                n--;
                i--;
            }
        }
        System.out.println ("\nThe packed array is : ");
        for (i = 0; i < n; i++)
            System.out.print (a [i] + " ");
        System.out.println ("\nThe array containing prime numbers is : ");
        for (i = 0; i < c; i++)
            System.out.print (prime [i] + " ");
    }
}
