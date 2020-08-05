package ThirdYear;

class SuperClass
{
    public SuperClass(){
        System.out.println("In super class.");
    }
    public SuperClass(int a){
        System.out.println("In int super class.");
    }
    void show(){
        System.out.println("In superclass show");
    }
}

class SubClass extends SuperClass
{
    public SubClass(){
        super(6);
        System.out.println("In sub class.");
    }
    public SubClass(int a){
        System.out.println("In int sub class.");
    }
    void show(){//Method overriding, subclass method overrides superclass method having the same name.
        //super.show(); to call show method in superclass
        System.out.println("In subclass show");
    }
}

public class Inheritance extends SubClass
{
    public static void main(String args[])
    {
        SubClass obj = new SubClass();
        obj.show();
    }
}
