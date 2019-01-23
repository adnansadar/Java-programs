package Constructors;

import java.io.*;
public class Pay
{
    String name;
    double salary,da,hra,gross;
    public void inputdata()throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the name of your employee:");
        name=in.readLine();
        System.out.println("Enter his basic salary:");
        salary=Integer.parseInt(in.readLine());
    }

    public void calculate()
    {
        da=0.15*salary;
        hra=0.10*salary;
        gross=salary+da+hra;
    }

    public void outputdata()
    {
        System.out.println("The name of the employee is: "+name);
        System.out.println("The employee's basic salary  is: "+"Rs "+salary);
        System.out.println("The dearness allowance is: "+"Rs "+da);
        System.out.println("The house rent allowance is: "+"Rs "+hra);
        System.out.println("The gross salary of the employee is: "+"Rs "+gross);
    }
}
