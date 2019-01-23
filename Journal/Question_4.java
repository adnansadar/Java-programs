package Journal;

import java.io.*;
public class Question_4
{
    public static void main(String[]args)throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the value of m");
        int m = Integer.parseInt(br.readLine());
        System.out.println("Enter the value of n");
        int n = Integer.parseInt(br.readLine());
        System.out.println("The prime palindrome numbers are : ");
        int i,j,c=0,d;
        for(i=m;i<=n;i++)
        { 
            int copy = i;
            for(j=1;j<=i;j++)
            {
                if(i%j==0)
                    c++;
            }
            if(c==2)
            {
                int s = 0;
                while(copy>0)
                {
                    d = copy%10;
                    s = (s*10)+d;
                    copy = copy/10;
                }
                if(s==i)
                    System.out.print(i+ " ");
            }
            c = 0;
        }
        System.out.println();
    }
}

