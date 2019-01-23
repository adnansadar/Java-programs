package Practice;

class sum
{
    int a,b,c;
    void getdata(int x,int y)
    {
        a=x;
        b=y;
    }

    void calculate()
    {
        c=a+b;
    }

    void display()
    {
        System.out.println("The Sum of 2 nos is "+c);
    }
}
class abc
{
    public static void main (String args[])
    {
        sum ob = new sum();
        ob.getdata(4,7);
        ob.calculate();
        ob.display();
    }
}
