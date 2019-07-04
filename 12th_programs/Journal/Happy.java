package Journal;
import java.io.*;
public class Happy
{
    int N;// public class variable to store value of input number.

    public Happy()
    {
        N = 0;
    }

    public void getnum(int nn) 
    {
        N=nn;
    }

    public int sum_sq_digits(int x)
    {
        int d,sum=0;// declaring data type for digits and sum.
        while(x>9)
        {
            sum=0;
            while(x>0)
            {
                d =x%10;
                sum = sum+(d*d);
                x=x/10;
            }
            if(sum<10)
            //return sum;
                break;
            else
                x=sum;
        }
        return sum;
    }        

    public static void main(String args[]) throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number to check if it is a Happy number or not.");
        int c= Integer.parseInt(br.readLine());
        Happy ob = new Happy();
        ob.getnum(c);
        if((ob.sum_sq_digits(c))==1)
            System.out.println("The number entered is a Happy number.");
        else
            System.out.println("The number entered is not a Happy number.");
    }// end of main
} //end of class

