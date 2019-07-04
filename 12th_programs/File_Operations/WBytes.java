package File_Operations;

import java.io.*;
public class WBytes
{
    public static void main(String args[])throws IOException
    {
     /**to initialize byte array*/
     byte capital[]={'R','A','N','C','H','I',' ','N','E','W',' ','D','E','L','H','I',' ','P','U','N','E'};
     /**To create an Output Stream*/
     FileOutputStream fout=null;
     /**To connect the outfile stream*/
     fout=new FileOutputStream("Capital.txt");
     /**To write data in the stream*/
     fout.write(capital);
     fout.close();
    }
}   