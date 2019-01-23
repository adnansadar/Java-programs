package Practice;

import java.io.*;
class octal_to_decimal
{
    int octal,decimal=0;
    int k=1;
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter an octal number:");
        int num=Integer.parseInt(in.readLine());
        octal_to_decimal ob = new octal_to_decimal();
        ob.toDecimal(num);
    }

    public void toDecimal(int octal)
    {
        if(octal==0)
        {
            decimal=0;
            System.out.println("The decimal representation is: "+decimal);
        }
        while(octal!=0){
            decimal = decimal + (octal%10)*k;
            k=k*8;
            octal=octal/10;
        }
        System.out.println("The decimal representation is: "+decimal);
    }
}

    