package ThirdYear;
import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        MortgageCalculator obj = new MortgageCalculator();
        System.out.print("******************MORTGAGE CALCULATOR******************\nEnter principal, rate and time: ");
        int p = scanner.nextInt();
        double r = scanner.nextDouble();
        int t = scanner.nextInt();
        r = r/100/12;
        t = t*12;
        obj.mortgage(p,r,t);
    }
    
    public void mortgage(int p, double r, int t)
    {
    double mortgage = (p*(r*(Math.pow(1+r,t))))/(Math.pow(1+r,t)-1);
    String result = NumberFormat.getCurrencyInstance().format(mortgage);
    System.out.println("Your mortgage is: "+result);
    }
}
