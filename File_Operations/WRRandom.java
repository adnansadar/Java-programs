package File_Operations;

import java.io.*;
public class WRRandom
{
    public static void main(String args[])throws IOException
    {
        File intFile=new File("Random.dat");
        FileOutputStream fout=new FileOutputStream(intFile);
        DataOutputStream ffout=new DataOutputStream(fout);
        int i,n;
        for(i=0;i<10;i++)
        {
            ffout.writeInt((int)(Math.random()*100));
        }
        ffout.close();
        FileInputStream fin=new FileInputStream(intFile);
        DataInputStream ffin=new DataInputStream(fin);
        System.out.println("Display random values between 10-99");
        for(i=0;i<10;i++)
        {
            n=ffin.readInt();
            System.out.println(n);
        }
        ffin.close();
    }
}
        
        