package Functions;

public class Function_Object
{
    public static void main (String args[])
    {
        Function_Object ob = new Function_Object();
        int a=5;
        int b=6;
        ob.show(a,b);
        System.out.println("Actual parameters after function operation " +a+ " "+b);
    }

    void show (int x,int y)
    {
        x=x+2;
        y=y+2;
        System.out.println("Formal parameters after function operation " +x+ " "+y);
    }
}