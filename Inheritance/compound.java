package Inheritance;

public class compound extends account
{
    double CI,rate,time;
    compound(double r,double t)
    {
        rate=r;
        time=t;
    }
    double calculate()
    {
        CI=principal*Math.pow((1+(rate/100)),time)-principal;
        return(CI);
    }
    void display()
    {
        super.display();
        System.out.println("The rate you entered is: "+rate);
        System.out.println("The time you entered is: "+time);
        System.out.println("Your Simple Interest is: "+calculate());
    }
}