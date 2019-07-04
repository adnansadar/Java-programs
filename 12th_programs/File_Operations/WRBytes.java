package File_Operations;

import java.io.*;
public class WRBytes
{
    public static void main(String args[])throws IOException
    {
        /**to initialize byte array*/
        byte capital[]={'R','A','N','C','H','I',' ','N','E','W',' ','D','E','L','H','I',' ','P','U','N','E'};
        /**To create an Output Stream*/
        FileOutputStream fout=new FileOutputStream("Capital.txt");
        /**To connect the outfile stream*/
        /**To write data in the stream*/
        fout.write(capital);
        fout.close();
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