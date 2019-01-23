import java.io.*;
import java.util.*;
class Stringbuffer
{
    public static void main(String args[])throws IOException 
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a string:"); 
        String str=in.readLine();
        StringBuffer p=new StringBuffer(str);
        
        System.out.println(p.reverse());
    }
}