package ThirdYear;

class Outer
{
    class Inner
    {
        void display(){
            System.out.println("In inner class");
        }
    }
}

public class OuterInner
{
    public static void main(String args[])
    {
        Outer obj = new Outer();
        Outer.Inner obj1 = obj.new Inner();
        obj1.display();
    }

}
