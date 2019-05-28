import java.io.*; //importing java package
public class Calculation //class name
{
    public static void main(String args[])//Main function
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); //Initializing the buffer
        Calculation ob = new Calculation(); //Creating an object                    
        System.out.println("Enter the values of a and b:");//Prompt user for inputs
        double a = Integer.parseInt(in.readLine());
        double b = Integer.parseInt(in.readLine());
        double c = ob.calculate(a,b);
        System.out.println("The Sum is: "+ob.sum());
        System.out.println("The Difference is: "+ob.diff());
        System.out.println("The Product is: "+ob.prod());
        System.out.println("The Quotient is: "+ob.quot());
        System.out.println("The Remainder is: "+ob.rem());
    }

    double calculate(double a , double b)
    {
        double s = a+b;
        double d = a-b;
        double p = a*b;
        double q = a/b;
        double r = a%b;
    }

    double sum()//user defined fuction sum()
    {
        double sum =int s;
        return sum;
    }

    double diff()
    {
        double diff = d;
        return diff;
    }

    double prod()
    {
        double prod = p;
        return prod;
    }

    double quot()
    {
        double quot = q;
        return quot;
    }

    double rem()
    {
        double rem = r;
        return rem;
    }
}