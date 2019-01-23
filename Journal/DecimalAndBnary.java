package Journal;

import java.io.*;
public class DecimalAndBnary
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("To enter a decimal number between 1 & 999 and convert it to binary equivalent enter '1'");
        System.out.println("Or to enter a binary number and convert it to  decimal equivalent enter '2'");
        int x= Integer.parseInt(br.readLine());
        switch (x)
        {
            case 1:
            {

                System.out.println("Enter a decimal number between 1 and 999.");
                int n= Integer.parseInt(br.readLine());
                String binary ="";
                if(n==0)
                {
                    binary="00";
                    System.out.println("The binary representation is "+ binary);
                }
                while(n>0)
                {
                    int rem= n%2;
                    binary = rem+ binary;
                    n=n/2;
                }
                System.out.println("The binary representation is "+ binary);
                break;
            }
            case 2:
            {
                int binary, dec=0, r=1;
                System.out.println("Enter a binary number.");
                int bin= Integer.parseInt(br.readLine());
                while (bin!=0)
                {
                    dec= dec+ (bin%10)*r;
                    r=r*2;
                    bin = bin /10;
                }
                System.out.println("The decimal representation is "+ dec);
                break;
            }
            default:
            System.out.println("The number entered is not invalid.");
        }
    }
}
