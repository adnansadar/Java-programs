package Functions;

import java.io.*;
public class Function_Vowels
{
    int count(String w)
    {
        int i,l,v=0;
        l=w.length();
        for(i=0;i<=l-1;i++)
        {
            char chr=w.charAt(i);
            if((chr=='a')||(chr=='e')||(chr=='i')||(chr=='o')||(chr=='u')||(chr=='A')||(chr=='E')||(chr=='I')||(chr=='O')||(chr=='U'))
            {    
            v=v+1;
            }
        }
        return(v);
    }

    public static void main (String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        String word;
        Function_Vowels ob=new Function_Vowels();
        System.out.println("Enter a word:");
        word=in.readLine();
        int k=ob.count(word);
        System.out.println("Total number of vowels present in the word are: "+k);
    }
}
