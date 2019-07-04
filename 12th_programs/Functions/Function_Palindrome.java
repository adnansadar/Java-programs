package Functions;

import java.io.*;
import java.math.*;
class Function_Palindrome
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a word:");
        String n=in.readLine();
        Function_Palindrome ob = new Function_Palindrome();
        String ans=ob.palindrome(n);
        if(ans=="yes")
            System.out.println("It is a palindrome word.");
        else
            System.out.println("It is not a palindrome word.");
    }

    public int palindrome(String n)
    {
        String n=m;
        int i;
        int l=n.length();
        String ans=" ";
        String word=" ";
        for(i=0;i<l;i++)
        {
            char c=n.charAt(i);
            word=c+word;
        }
        if(word==m)
        {
            ans="yes";
        }
        else
        {
            ans="no";
        }
        return(ans);
    }
}