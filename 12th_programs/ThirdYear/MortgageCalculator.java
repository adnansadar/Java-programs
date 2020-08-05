package ThirdYear;
import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator
{
    Scanner scanner = new Scanner(System.in);
    public static void main(String args[])
    {
        MortgageCalculator obj = new MortgageCalculator();
        System.out.print("******************MORTGAGE CALCULATOR******************\nEnter principal, rate and time: ");
        obj.mortgage();
    }
    
    public void mortgage()
    {
        int p=0;
        int t=0;
        double r=0.0;
            do{
            System.out.println("Principal:");
            System.out.println("Enter an amount between Rs10,000 and Rs10,00,000");
            p = scanner.nextInt();
        }while(p < 10000 || p > 1000000);
        do{
            System.out.println("Annual Interest Rate:");
            System.out.println("Enter a value between 0 less than or equal to 10%");
            r = scanner.nextDouble();
        }while(r > 10 || r < 0);
        do{
            System.out.println("Period(Years):");
            System.out.println("Enter a value between 1 and 30");
            t = scanner.nextInt();
        }while(t < 1 || t > 30);
        r = r/100/12;
        t = t*12;
        double mortgage = (p*(r*(Math.pow(1+r,t))))/(Math.pow(1+r,t)-1);
        String result = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Your mortgage is: "+result);
    }   
}
