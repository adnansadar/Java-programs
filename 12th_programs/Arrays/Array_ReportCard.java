package Arrays;

import java.io.*;
public class Array_ReportCard
{
    public static void main (String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int i,j,sum=0;
        int m[]=new int [6];
        System.out.println("\t\t***************REPORT CARD***********************");
        System.out.println("\n\nEnter your marks of six subjects:");
        for(i=0;i<6;i++)
        {
            m[i]=Integer.parseInt(in.readLine());
        }
        for(j=0;j<6;j++)
        {
            sum=sum+m[j];
        }
        double p=sum/6;
        System.out.println("\n\nYour total marks are: " +sum);
        System.out.println("\n\nYour percentage is: " +p);
    }
}

        