package Journal;

/**
 * Write a program to input a sentence where words are separated by a single space.
 * The sentence terminates with a “.” , “,” , “?” or “!”. Rearrange the words in ascending order of length of words.
 * Eg. INPUT : Today is Monday
 * OUTPUT : Is
 *          Today
 *          Monday
 */
import java.io.*;
public class Question_3
{
    public static void main (String args []) throws IOException
    {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        System.out.println ("Enter a sentence : ");
        String s = br.readLine ();
        int ct = 1, j = 0, i;
        String w = "", str, temp;
        char l = s.charAt (s.length ()-1);
        if (s.endsWith (".") || s.endsWith ("?") || s.endsWith ("!")|| s.endsWith (",")) 
        {
            for (i=0; i<s.length();i++)
            {
                char ch = s.charAt (i);
                if (ch == ' ')
                    ct ++;
            } 
            str = (s.substring (0, s.length ()-1))+" ";
            String a[] = new String [ct];
            for (i = 0; i<str.length();i++)
            {
                char ch = str.charAt (i);   
                if (ch == ' ')
                {
                    a[j] = w;
                    w = "";
                    j++;
                }
                else 
                    w = w + ch;
            } 
            for (i = 0; i < ct; i++)
            {
                for (j = 0; j < ct-i-1; j++)
                {
                    if (a [j+1].length () < a [j].length ())
                    {
                        temp = a [j+1];
                        a [j+1] = a [j];  
                        a [j] = temp;
                    }
                }
            } 
            System.out.println ("The sentence in ascending order of length of words is : ");
            for (i = 0; i < ct; i++)
            {
                if (i != ct-1)
                    System.out.println (a [i] + " ");
                else
                    System.out.println (a [i] + l);
            } 
        }
        else
            System.out.println ("INVALID INPUT ");
    }
}
