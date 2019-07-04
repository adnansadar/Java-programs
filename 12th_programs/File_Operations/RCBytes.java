package File_Operations;

import java.io.*;
public class RCBytes
{
    public static void main(String args[])throws IOException
    {
        FileInputStream fin=new FileInputStream("Book.txt");
        int b;
        while((b=fin.read())!=-1)
        {
            System.out.println((char)b);
        }
        fin.close();
    }
}
        