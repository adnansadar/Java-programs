package Functions;

public class Function_Sum
{
    public static void main (String args[])
    {
        int a=5,b=10;
        System.out.println("The function add is called the main function.");
        int z=add(a,b);
        System.out.println("Sum of two numbers " +a+" and "+b+ " is " +z);
        System.out.println("The answer is calculated and displayed.");
    }

    public static int add(int x,int y)
    {
        int c=0;
        c=x+y;
        return c;
    }
}