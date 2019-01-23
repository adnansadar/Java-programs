import java.io.*;
public class Special_Number
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int num,m,p,d,q,s=0,f=1;
        System.out.println("Enter a number: ");
        num=Integer.parseInt(in.readLine());
        m=num;
        while(m!=0)
        {
            q=m/10;
            p=q*10;
            d=m-p;
            for(int i=1;i<=d;i++)
                f=f*i;
            s=s+f;
            f=1;
            m=m/10;
        }
        if(s==num)
            System.out.println("It is Special Number");
        else
            System.out.println("It is not a Special Number");
    }
}

      