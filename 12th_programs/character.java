import java.io.*;

public class character
{
    public static void main (String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        char chr,chr1;
        System.out.println("Enter a character:");
        chr=(char)in.read();

        if(Character.isUpperCase(chr))
        {
            System.out.println(chr+ " is an uppercase letter.");
            chr1=Character.toLowerCase(chr);
            System.out.println("The lowercase of the character is " +chr1);
        }

        if(Character.isLowerCase(chr))
        {
            System.out.println(chr+ " is a lowercase character.");
            chr1=Character.toUpperCase(chr);
            System.out.println("The uppercase of the character is " +chr1);
        }
        else
        {
            if(Character.isDigit(chr))
            {
                System.out.println(chr+ " is a digit.");
            }
            else
            {
                System.out.println(chr+ " is a special character.");
            }
        }
    }
}
