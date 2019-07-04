package Functions;

import java.io.*;
class Function_FascinatingNumbers
{
    boolean isUnique(String q)
    {
        int A[]={0,0,0,0,0,0,0,0,0,0};
        int i,flag=0;
        char ch;
        for(i=0;i<q.length();i++)
        {
            ch=q.charAt(i);
            A[ch-48]++;
        }
        for(i=1;i<10;i++)
        {
            if(A[i]!=1)
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
            return false;
        else
            return true;
    }

    public static void main(String args[])throws IOException
    {
        BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
        Function_FascinatingNumbers ob=new Function_FascinatingNumbers();
        System.out.println("Enter a number:");
        int n=Integer.parseInt(in.readLine());
        String p=Integer.toString(n);
        if(p.length()<3)
            System.out.println("The number should be atleast 3 digits");
        else
        {
            String s=Integer.toString(n*1)+ Integer.toString(n*2)+ Integer.toString(n*3);
            if(ob.isUnique(s))
                System.out.println(n+ " is a fascinating  number.");
            else
                System.out.println(n+ " is not a fascinating  number.");
        }
    }
}

       