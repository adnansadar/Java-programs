package Constructors;

class Increment
{
    String n;
    double b;
    int a;
    public void getdata(String name,double basic,int age)
    {
        n=name;
        b=basic;
        a=age;
    }

    public void calculate()
    {
        double inc=0.0;
        if(a>=56)
        {
            inc=0.20*b;
        }
        if((a>45)&&(a<=56))
        {
            inc=0.15*b;
        }
        if(a<45)
        {
            inc=0.10*b;
        }
        b = b+inc;
    }

    public void display()
    {
        System.out.println("Age \t\t\t\t Basic");
        System.out.println(+a+"\t\t\t\t"+b);
    }
}
