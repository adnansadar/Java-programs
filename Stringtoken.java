import java.io.*;
import java.util.*;
class Stringtoken
{
    public static void main(String args[])throws IOException 
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int c=0;
        System.out.println("Enter a string:");
        String example=in.readLine();
        StringTokenizer stk=new StringTokenizer(example,". ,;!.");
        while(stk.hasMoreTokens())
        {
            System.out.println(stk.nextToken());
            c=c+1;
        }
        System.out.println(c);
    }
}

