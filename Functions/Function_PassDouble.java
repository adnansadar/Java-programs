package Functions;

import java.io.*;
public class Function_PassDouble
{
    void cal_pow(double base,double power)
    {
        double result=1;
        for(int i=1;i<=power;i++)
        {
            result=result*base;
        }
        System.out.println("The result is:" +result);
    }

    public static void main (String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Function_PassDouble Pr = new  Function_PassDouble();
        double db,dp;
        System.out.println("Enter the base number:");
        db=Integer.parseInt(in.readLine());
        System.out.println("Enter the power:");
        dp=Integer.parseInt(in.readLine());
        Pr.cal_pow(db,dp);
    }

}