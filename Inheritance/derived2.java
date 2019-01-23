package Inheritance;

class derived2 extends base1
{
    int a=5;
    public void display()
    {
     System.out.println("a= "+a);
     System.out.println("I belong to derived class.");
     System.out.println("a in super class is: "+super.a);
    }
    public void otherMethod()
    {
        System.out.println("I will now store a new value in 'a'");
        a=50;
        super.display(a);
    }
}
