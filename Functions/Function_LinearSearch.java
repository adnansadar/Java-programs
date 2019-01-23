package Functions;

import java.io.*;
public class Function_LinearSearch
{
    int LSearch(String name[],String ns)
    {
        int j,p=0;
        for(j=0;j<5;j++)
        {
            if(name[j].equals(ns))
                p=1;
        }
        return(p);
    }

    public static void main (String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int i,k;
        Function_LinearSearch ob=new Function_LinearSearch();
        String ns;
        String name[]=new String[5];
        System.out.println("Enter 5 different words:");
        for(i=0;i<5;i++)
        {
            name[i]=in.readLine();
        }
        System.out.println("Enter the name to be searched:");
        ns=in.readLine();
        k=ob.LSearch(name,ns);
        if(k==1)
            System.out.println("Search Successful!! The name is present.");
        else
            System.out.println("The name is not present! Stop fooling around :3");
    }
}

        