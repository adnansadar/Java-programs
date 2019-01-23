package Journal;

/**
 * Write a program to input 'n' – the number of sentences to be worked on (1<=n <=5) and
 * print even numbered sentences in title case and others in reverse order of words.
 */
import java.io.*;
public class Question_5
{
    public static void main(String[]args)throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the no of sentences : minimum of 1 sentence and a maximum of 5 sentences.");
        int n = Integer.parseInt(br.readLine());
        String a[] = new String[n];
        System.out.println("Enter the sentences");
        for(int i=0;i<n;i++)
        {
            a[i] = br.readLine();
        }
        String sj="";
        //Even sentences
        for(int j=1;j<n;j=j+2)
        {
            a[j] = " " + a[j];
            for(int k=0;k<a[j].length();k++)
            {
                char ch = a[j].charAt(k);
                if(ch==' ')
                {
                    char ch2 = a[j].charAt(k+1);
                    ch2 = Character.toUpperCase(ch2);
                    sj = sj + " " + ch2;
                    k++;
                }
                else
                    sj = sj + ch;
            }
            a[j] = sj;
            sj = "";
        }
        //Odd sentences
        String s="",s2="";
        for(int l=0;l<n;l=l+2)
        {
            a[l] = " " + a[l];
            for(int m=a[l].length()-1;m>=0;m--)
            {
                char c = a[l].charAt(m);
                if(c!=' ')
                {
                    s = c + s;
                }
                else
                { 
                    s2 = s2 + s + " ";
                    s = "";
                }
            }
            a[l] = s2;
            s2 = "";
        }
        System.out.println("The new sentences are : ");
        for(int u=0;u<n;u++)
        {
            System.out.println(a[u]);
        }}}
