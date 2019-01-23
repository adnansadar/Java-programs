package File_Operations;

import java.io.*;
import java.util.*;
public class Wtextfile
{
    public static void main(String args[])throws IOException
    {
        FileWriter fout=new FileWriter("RV.txt");
        BufferedWriter ffout=new BufferedWriter(fout);
        PrintWriter ob= new PrintWriter(ffout);
        Scanner sc= new Scanner(System.in);
        int i;
        String adm,name1,name2,cl;
        int total;
        System.out.println("*********YOUR INFORMATION********");
        for(i=0;i<3;i++)
        {
            System.out.println("Enter Adm.No.");
            adm=sc.next();
            System.out.println("Enter first name");
            name1=sc.next();
            System.out.println("Enter surname");
            name2=sc.next();
            System.out.println("Enter class");
            cl=sc.next();
            System.out.println("Enter total marks");
            total=sc.nextInt();
            ob.println(adm);
            ob.println(name1);
            ob.println(name2);
            ob.println(cl);
            ob.println(total);
        }
        ffout.close();
    }
}
            