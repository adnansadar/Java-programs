import java.io.*;
public class Name_forloop
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String st;
        System.out.println("Enter your name:");
        st=in.readLine();
        System.out.println("OUTPUT:");
        for(int i=1;i<=10;i++)
        {
            System.out.println(i+":"+st);
        }
    }
}

      