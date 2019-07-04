package File_Operations;

import java.io.*;
public class WPrimitive
{
    public static void main(String args[])throws IOException
    {
        File intFile=new File("Number.dat");
        FileOutputStream fout=new FileOutputStream(intFile);
        DataOutputStream ffout=new DataOutputStream(fout);
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int i,n;
        System.out.println("Enter values:");
        for(i=0;i<5;i++)
        {
            n=Integer.parseInt(in.readLine());
            ffout.write(n);
        }
        ffout.close();
    }
}