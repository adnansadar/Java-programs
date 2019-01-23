import java.io.*;
public class Odd_Even
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n;
        System.out.println(" Enter 0 to terminate the program ");
        do
        {
            System.out.println(" Enter a Number: ");
            n=Integer.parseInt(in.readLine());
            if(n==0)
                System.out.println(" Program Terminates ");
            else
            {
                if (n%2==0)
                    System.out.println(" It is an Even Number ");
                else
                    System.out.println(" It is an Odd Number ");
            }
        }while (n!=0);
    }

}

      