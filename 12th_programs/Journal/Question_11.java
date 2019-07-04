package Journal;

import java.io.*;
public class Question_11
{
    static boolean pword(String a)
    {
        int l= a.length();
        int flag=1;
        if(l<3)
            return false;
        for(int i=0;i<l;i++)
        {
            if((a.charAt(i))!=(a.charAt(l-(i+1))))
            {
                flag=0;
                break;
            }
        }
        if(flag==0)
            return false;
        else
            return true;
    }

    public static void main(String[]args)throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a sentence to find the frequency of palindrome words in it.");
        String s = br.readLine();
        int l = s.length();
        String w="";
        int c=0;
        for(int i=0;i<l;i++)
        {
            char ch= s.charAt(i);
            if((ch==' ')&&(pword(w)==true))
            {
                c++;
                w="";
            }
            else 
                w= w+ch;
        }
        System.out.println("The freqency of palindrome words in the sentence is: "+c);
    }
}
