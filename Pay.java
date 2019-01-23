import java.io.*;
class Pay 
{
    double pay;
    BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
    public void tp()throws IOException
    {
     System.out.println("Enter your pay: ");
     pay=Integer.parseInt(in.readLine());
    }
}
 class salary extends Pay
{
    public void op()
    {
        double tax=0.1*pay;
        double salary=pay-tax;
        System.out.println("Your salary is: " +salary);
    }
}
