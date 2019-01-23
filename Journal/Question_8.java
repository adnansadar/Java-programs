package Journal;

import java.io.*;
public class Question_8
{   
    public static void main(String[]args)throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a three lettered word.");
        String s = br.readLine();
        int l = s.length();
        int a,b,c=0;
        if(l<4)
        {
            for(int i=0;i<3;i++)
            {
                if(i==0)
                {
                    a=1;
                    b=2;
                    c= c+2;
                    System.out.println(s.charAt(i)+""+s.charAt(a)+""+s.charAt(b));
                    System.out.println(s.charAt(i)+""+s.charAt(b)+""+s.charAt(a));
                }
                else if(i==1)
                {
                    a=0;
                    b=2;
                    c=c+2;
                    System.out.println(s.charAt(i)+""+s.charAt(a)+""+s.charAt(b));
                    System.out.println(s.charAt(i)+""+s.charAt(b)+""+s.charAt(a));
                }
                else
                {
                    a=0;
                    b=1;
                    c=c+2;
                    System.out.println(s.charAt(i)+""+s.charAt(a)+""+s.charAt(b));
                    System.out.println(s.charAt(i)+""+s.charAt(b)+""+s.charAt(a));
                }
            }
            System.out.println("The no of total anagrams is:"+c);
        }
        else 
            System.out.println("Please enter a smaller word");
    }
}
