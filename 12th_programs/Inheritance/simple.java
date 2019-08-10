package Inheritance;

public class simple extends account
{
    double SI,rate,time;
    simple(double r,double t)
    {
        rate=r;
        time=t;
    }
    double calculation()
    {
        SI=(principal*rate*time)/100;
        return(SI);
    }
    void display()
    {
        account ob = new account();
        ob.display();
        System.out.println("The rate you entered is: "+rate);
        System.out.println("The time you entered is: "+time);
        System.out.println("Your Simple Interest is: "+calculation());
    }
}
    