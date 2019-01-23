package Arrays;
//wrmg output
import java.io.*;
public class Array_BinarySearch
{
    public static void main (String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int i,t,k,ns,f,l,p;
        ns=0;f=0;l=9;p=0;k=0;
        int num[]=new int[10];
        System.out.println("Enter 10 numbers in an ascending order:");
        for(i=0;i<10;i++)
        {
            num[i]=Integer.parseInt(in.readLine());
        }
        System.out.println("Enter the number to be searched in the array:");
        ns=Integer.parseInt(in.readLine());
        while(f<=l)
        {
            p=(f+l)/2;
            if(num[p]<ns)
                f=p+1;
            if(num[p]>ns)
                l=l-1;
            if(num[p]==ns)
            {
                k=1;
                break;
            }
        }
        if(k==1)
            System.out.println("Search successful! \nThe number is present in the array.");
        else
            System.out.println("The number is not present in the array!!");
    }
}