package File_Operations;

import java.io.*;
public class CBytes
{
    public static void main(String args[])throws IOException
    {
        FileInputStream fin=new FileInputStream("Capital.txt");
        FileOutputStream fout=new FileOutputStream("Book.txt");
        int b;
        do
        {
            b=fin.read();
            fout.write((char)b);
        }
        while(b!=-1);
        fin.close();
        fout.close();
    }
}
        
        