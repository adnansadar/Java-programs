import java.io.*;
public class Tribonacci
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int num;
        System.out.println("\t\tTribonacci Series:\n\n");
        System.out.print("\tEnter the total numbers you want in this series:");
        num=Integer.parseInt(in.readLine());
        int a=0;
        int b=1;
        int c=2;
        int d=0;
        System.out.println("\t*****************************");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        for (int i=4;i<=num;i++)
        {
            d=a+b+c;
            System.out.println(d);
            a=b;
            b=c;
            c=d;
        }   
    }
}