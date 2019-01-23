package File_Operations;

import java.io.*;
public class RPrimitive
{
    public static void main(String args[])throws IOException
    {
        File intFile=new File("Number.dat");
        FileInputStream fin=new FileInputStream(intFile);
        DataInputStream ffin=new DataInputStream(fin);
        System.out.println("Display values:");
        int i,n;
        for(i=0;i<5;i++)
        {
            n=ffin.readInt();
            System.out.println(n);
        }
        ffin.close();
    }
}