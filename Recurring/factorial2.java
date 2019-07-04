package Recurring;

class factorial2
{
    int fact(int n)
    {
        if(n==0)
            return(1);
        else
            return(n*fact(n-1));
    }

    public static void main(String args[])
    {
        int k=5,f;
        factorial2 ob= new factorial2();
        f=ob.fact(k);
        System.out.println("Factorial of the no "+k+" is "+f);
    }
}