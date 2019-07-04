package Inheritance;

import java.io.*;
class employee1
{
    String name;
    int empcode,basic;
    void getdata()throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the name of the employee: ");
        name=in.readLine();
        System.out.println("Enter the employee code: ");
        empcode=Integer.parseInt(in.readLine());
        System.out.println("Enter the basic salary: ");
        basic=Integer.parseInt(in.readLine());
    }
    void showdata()
    {
         System.out.println("Name of the employee: " +name);
         System.out.println("Employee code: " +empcode);
         System.out.println("Basic Salary: " +basic);
    }
}