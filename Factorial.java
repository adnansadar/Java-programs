import java.io.*;
public class Factorial
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int num,i,fact=1;
        System.out.println("Enter a number:");
        num=Integer.parseInt(in.readLine());
        for(i=1;i<=num;i++)
        {
            fact=fact*i;
        }
        System.out.println("The factorial of " +num+ " is : " +fact);
    }
}

;     


      