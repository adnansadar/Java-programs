public class salary extends Pay
{
    public void op()
    {
        double p=pay;
        double tax=0.1*p;
        double salary=pay-tax;
        System.out.println("Your salary is: " +salary);
    }
}