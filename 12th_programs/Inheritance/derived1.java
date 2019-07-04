package Inheritance;
class derived1 extends base1
{
    protected int a=5;
    public void display()
    {
     System.out.println("a= "+a);
     System.out.println("I belong to derived class.");
     super.display(10);
    }
}