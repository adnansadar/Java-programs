package Journal;
import java.io.*;
public class Question_9
{
    public static void main(String[]args)throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number");
        int n = Integer.parseInt(br.readLine());
        System.out.println("The possible consecutive number combinations are: ");
        int sum = 0, c=0, j=0;
        int i;
        for(i=1;i<n;i++)
        {
            sum = i;
            j = i+1;
            while(sum<n)
            {
                sum = sum+j;
                j++;
            }
            if(sum==n)
            {
                int k;
                for(k=i;k<j;k++)
                {
                    if(k==i)
                        System.out.print(k);
                    else
                        System.out.print("  "+k);
                }
                System.out.println();
            }
        }
    }
}

