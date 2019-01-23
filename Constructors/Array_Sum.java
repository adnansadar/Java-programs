package Constructors;

import java.io.*;
class Array_Sum
{
    int i;
    double sum=0;
    int m[] = new int[5];
    public void inputdata()throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" Enter 5 marks: ");
        for(i=0;i<5;i++)
        {
            m[i]=Integer.parseInt(in.readLine());
        }
    }

    public void calculate()
    {
        for(i=0;i<5;i++)
        {
            sum=sum+m[i];
        }
    }

    public void outputdata()
    {
        System.out.println("The sum of the marks entered is: "+" Rs " +sum);
    }
}
