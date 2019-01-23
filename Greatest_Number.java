import java.io.*;
public class Greatest_Number
{
    public static void main(String args[])throws IOException
    {
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      int a,b,c;
      System.out.println("\t\t\tTHE GREATEST NUMBER:");
      System.out.println("Enter three numbers:");
      a=Integer.parseInt(in.readLine());
      b=Integer.parseInt(in.readLine());
      c=Integer.parseInt(in.readLine());
      if (a>b)
      {
          if (a>c) 
          System.out.println("The Greatest number is: "+a);
      }
      if (b>c)
        {
            if(b>a)
            System.out.println("The Greatest number is: "+b);
        }
      if (c>a)
        {
            if(c>b)
            System.out.println("The Greatest number is: "+c);
        }
    }
}
        
          
          
          
    
    