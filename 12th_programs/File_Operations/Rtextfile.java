package File_Operations;

import java.io.*;
import java.util.*;
public class Rtextfile
{
    public static void main(String args[])throws IOException
    {
        FileReader fin=new FileReader("RV.txt");
        BufferedReader ffin=new BufferedReader(fin);
        Scanner sc= new Scanner(System.in);
        int p;
        System.out.println("Enter 1.To display the records,2.To display the record getting highest mark \n Enter your choice:");
        p=sc.nextInt();
        switch(p)
        {
            case 1:
            int i=0;
            String adm,name1,name2,cl;
            int total;
            System.out.println("********Display records of the file RV.txt*******");
            System.out.println("Adm.No. \t Name \t\t Class \t Total");
            Scanner sc1=new Scanner(new File("RV.txt"));
            while(sc1.hasNext())
            {
                adm=sc1.next();
                name1=sc1.next();
                name2=sc1.next();
                cl=sc1.next();
                total=sc1.nextInt();
                System.out.println(adm+" \t "+name1+" " +name2+" \t\t " +cl+" \t " +total);
            }
            sc1.close();
            break;
            case 2:
            int max=0;
            String ad="",n1="",n2="",c="";
            Scanner sc2=new Scanner(new File("RV.txt"));
            while(sc2.hasNext())
            {
                adm=sc2.next();
                name1=sc2.next();
                name2=sc2.next();
                cl=sc2.next();
                total=sc2.nextInt();
                if(max<total)
                {
                    max=total;
                    ad=adm;
                    n1=name1;
                    n2=name2;
                    c=cl;
                }
            }
            System.out.println("*******The record getting the highest marks:**********");
            System.out.println("Adm.No. \t Name \t Class \t Total");
            System.out.println(ad+" \t "+n1+" \t " +n2+" \t " +c+" \t " +max);
            break;
            default:
            System.out.println("Are you DYSLEXIC!?");
        }
    }
}
