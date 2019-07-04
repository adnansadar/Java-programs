package Functions;

import java.io.*;
class Income_Tax
{
    double MSalary,IncomeTax,AnnualSal;
    String Name,Address,Phone,Qualification,SubjectSP;
    Income_Tax()
    {
        MSalary=0;
        IncomeTax=0;
        AnnualSal=0;
    }

    void Accept_Data()throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\t\t Enter teacher's information:");
        System.out.println();
        System.out.print("Enter name:");
        Name=in.readLine();
        System.out.print("Enter address:");
        Address=in.readLine();
        System.out.print("Enter phone no. :");
        Phone=in.readLine();
        System.out.print("Enter qualification:");
        Qualification=in.readLine();
        System.out.print("Enter Subject Specialisation:");
        SubjectSP=in.readLine();
        System.out.print("Enter monthly salary:");
        MSalary=Integer.parseInt(in.readLine());
    }

    void DisplayData()
    {
        System.out.println("\t\tTecher's Information:");
        System.out.println("\t----------------------------------");
        System.out.println("Name: "+Name);
        System.out.println("Address: "+Address);
        System.out.println("Phone No.: "+Phone);
        System.out.println("Qualification: "+Qualification);
        System.out.println("Subject Specialisation: "+SubjectSP);
        System.out.println("Monthly Salary: "+MSalary);
        System.out.println();
    }

    void Compute_Tax()
    {
        AnnualSal=MSalary*12;
        System.out.println("Annual Salary: "+AnnualSal);
        if(AnnualSal>175000)
        {
         IncomeTax=0.05*(AnnualSal-175000);
         System.out.println("Income Tax: " +IncomeTax);
        }
    }
    public static void main(String args[])throws IOException
    {
        Income_Tax ob = new Income_Tax();
        ob.Accept_Data();
        ob.DisplayData();
        ob.Compute_Tax();
    }
}

    