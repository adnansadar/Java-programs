import java.io.*;
public class ASCIIRange
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int choice;
        System.out.println("Enter the ASCII code:");
        choice=Integer.parseInt(in.readLine());

        if (choice>=48 && choice<=57)
        { 
            System.out.println("The ASCII code represents digits");
        }

        else if(choice>=65 && choice<=90)
        {
            System.out.println("The ASCII code represents an Upper case character");
        }

        else if(choice>=97 && choice<=122)
        {
            System.out.println("The ASCII code represents a Lower case character");
        }
        else
        {
            System.out.println("The ASCII code represents a special character");
        }
    }
}

            
          