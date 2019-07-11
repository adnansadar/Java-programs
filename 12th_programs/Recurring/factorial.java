package Recurring;

class factorial
{
    int factorial(int n)
    {
        if(n==1)

            return(1);
        else
            return(n*factorial(n-1));
    }

    public static void main(String args[])
    {
        factorial ob=new factorial();
        System.out.println("Factorial of 3 is "+ ob.factorial(3));
        System.out.println("Factorial of 4 is "+ ob.factorial(4));
        System.out.println("Factorial of 5 is "+ ob.factorial(5));
        System.out.println("Factorial of 6 is "+ ob.factorial(6));
    }
}