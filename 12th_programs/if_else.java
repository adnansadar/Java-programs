import java.io.*;
public class if_else
{
    public static void main (String args[]) throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n1,n2,n3;
        System.out.println("Enter the value of n1: ");
        n1= Integer.parseInt(in.readLine());
        System.out.println("Enter the value of n2: ");
        n2=Integer.parseInt(in.readLine());
        System.out.println("Enter the value of n3: ");
        n3=Integer.parseInt(in.readLine());
        if((n1>n2)&&(n1>n3))
            System.out.println("The greatest number is: " +n1);
        else if((n2>n1)&&(n2>n3))
            System.out.println("The greatest number is: " +n2);
        else
            System.out.println("The greatest number is: " +n3);
    }
}

    