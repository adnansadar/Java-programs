import java.io.*;
public class Keith_Number
{
    public static void main (String args[])throws IOException
    {
        {
            BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter the number:");
            int n=Integer.parseInt(in.readLine());
            int copy=n;
            String s = Integer.toString(n);
            int d=s.length();
            int arr[]=new int[n];
            for(int i=d-1;i<=0;i--)
            {
                arr[i]=copy%10;
                copy=copy/10;
            }
            int i=d;int sum=0;
            while(sum<n)
            {
                sum=0;
                for(int j=1;j<=d;j++)
                {
                    sum=sum+arr[i-j];
                }
                arr[i]=sum;
                i++;
            }
            if(sum==n)
                System.out.println("It is a Keith Number.");
            else
                System.out.print("It is not a Keith number.");
        }
    }
}
