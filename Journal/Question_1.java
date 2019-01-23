package Journal;

import java.io.*;
public class Question_1
{
    public static void main(String[]args)throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true)
        {
            System.out.println("Enter the values of a,b,c");
            System.out.println("Enter 'n' to terminate");            
            String a,b,c;
            a = br.readLine();
            if(a.equals("n"))
                break;
            b = br.readLine();
            if(b.equals("n"))
                break;
            c = br.readLine();
            if(c.equals("n"))
                break;
            int a1,b1,c1;
            a1 = Integer.parseInt(a);
            b1 = Integer.parseInt(b);
            c1 = Integer.parseInt(c);
            System.out.println("The value of the given expression is : "
                + (Math.pow(a1,b1)*Math.pow(b1,c1))/(a1*b1*c1));
        }}}

