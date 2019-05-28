import java.io.*;
public class Solution
{
 public static void main(String[] args) throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number:");
            int n= Integer.parseInt(in.readLine());
        if((n%2==1) || (n>=6 && n <= 20))
        {
                 System.out.println("Weird");
        }
        else
        {
                System.out.println("Not Weird");
        }
    }
}