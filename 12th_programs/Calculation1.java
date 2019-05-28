public class Calculation1
{
    public static void main (String args[])
    {
        System.out.println("The simple interest is: Rs " +SI());
        System.out.println("The Maturity Value is: Rs " +MV());
    }

    static double SI()
    {
        int m = 300,n=8,r=8;
        double SI = (double)m*n*(n+1)/2*1/12*r/100;
        return SI;
    }

    static double MV()
    {
        int m = 300,n=8;
        double MV = (m*n)+ SI();
        return MV;
    }
}
