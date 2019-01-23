package Journal;

import java.io.*;
public class MersenneOrAutomorphic
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number : ");
        long n = Long.parseLong(br.readLine());
        System.out.println("To check if the number entered is an automorphic number enter the character 'a'");
        System.out.println("Or if you want to check if the number is a mersenne number enter 'm'. ");
        char x= (char)br.read();
        switch (x)
        {
            case 'm' :
            case 'M' :
            int flag=0;
            long num= 0;
            for(int i=1;i<n;i++)
            {
                num=(long)(Math.pow(2,i)-1);
                if(num==n)
                {
                    flag =1;
                    break;
                }
            }
            if(flag==1)
                System.out.println("The number entered is a mersenne number");
            else
                System.out.println("The number entered is not a mersenne number");
            break;
            case 'a':
            case 'A':
            long sq = n*n; // Finding the square
            long c = 0, copy = n;
            while(copy > 0)// Counting digits
            {
                c++;
                copy = copy/10;
            }
            long end = sq % (int)Math.pow(10,c);     
            if(n == end)
                System.out.println("The number entered is an Automorphic Number.");
            else
                System.out.println("The number entered is not an Automorphic Number.");
            break;
            default:
            System.out.println("The character entered is not invalid.");
        }
    }
}
