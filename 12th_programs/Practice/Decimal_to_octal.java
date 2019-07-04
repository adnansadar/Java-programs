package Practice;

import java.io.*;
class Decimal_to_octal
{
    public void tooctal(int n)
    {
        String binary = "00";
        if(n==0)
        {
            binary="00";
            System.out.println("The octal representation is: "+binary);
        }
        while(n>0)
        {
            int rem=n%8;
            binary = rem + binary;
            n=n/8;
        }
        System.out.println("The octal representation is: "+binary);
    }

    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number(asssuming it is positive integer):");
        int decimal = Integer.parseInt(in.readLine());
        Decimal_to_octal ob = new Decimal_to_octal();
        ob.tooctal(decimal);
    }
}

    