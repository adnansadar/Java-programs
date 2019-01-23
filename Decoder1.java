import java.io.*;
class Decoder1
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int l,a=0;
        String decode=" ";
        System.out.println("Enter coded text:");
        String code=in.readLine();
        System.out.println("Enter shift:");
        int shift=Integer.parseInt(in.readLine());
        if((shift<1)&&(shift>26))
            System.out.println("Invalid Input");
        else
        {
            l=code.length();
            for(int i=0;i<l;i++)
            {
                char chr=code.charAt(i);
                a=(int)chr+(shift);
                if((char)a=='Q')
                {
                    if(code.charAt(i+1)+shift=='Q'&&i<l)
                    {
                        a=32;
                        i++;
                    }
                }
                if(a>90)
                    a=a-26;
                decode=decode+(char)a;
            }
        }
        System.out.println("Decoded Text: " +decode);
    }
}
