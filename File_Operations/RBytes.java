package File_Operations;

import java.io.*;
public class RBytes
{
    public static void main(String args[])throws IOException
    {
        FileInputStream fin=new FileInputStream("Capital.txt");
        int p;
        System.out.println("Bytes of file Capital.txt are");
        while((p=fin.read())!=-1)
        {
        System.out.print((char)p);
        }
        fin.close();
    }
}