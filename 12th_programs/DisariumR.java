import java.io.*;
class DisariumR
{
    int num,size,s=0;
    DisariumR(int nn)
    {
        num=nn;
        size=0;
    }
    void countDigit()
    {
        int t=num;
        while(t>0)
        {
            size++;
            t=t/10;
        }
    }
    int sumofDigits(int num,int size)
    {
        if(size==0)
        {
            return(s);
        }
        else
        {
            int d=num%10;
            s=s+(int)Math.pow(d,size);
            return(sumofDigits(num/10,size-1));
        }
    }
    void check()
    {
        countDigit();
        if(sumofDigits(num,size)==num)
        {
            System.out.println("It is a Disarium Number");
        }
        else
        {
            System.out.println("It is not a Disarium Number");
        }
    }
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number:");
        int n=Integer.parseInt(in.readLine());
        DisariumR ob =new DisariumR(n);
        ob.check();
    }
}
      