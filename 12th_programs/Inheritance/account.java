package Inheritance;

public class account
{
    protected int accountnumber;
    protected double principal;
    void account(int a,double p)
    {
        accountnumber=a;
        principal=p;
    }
    void display()
    {
     System.out.println("The entered account number is: "+accountnumber);
     System.out.println("The principal is: Rs "+principal);
    }
}
