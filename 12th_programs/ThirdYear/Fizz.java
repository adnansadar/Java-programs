package ThirdYear;
import java.util.Scanner;

//If no entered by user is divisible by 5 print Fizz, div by 3 print Buzz, if div by both print FizzBuzz else print the no entered by the user.
public class Fizz
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int no;
        System.out.print("Enter a no: ");
        no = sc.nextInt();
        if(no%5==0 && no%3==0){
            System.out.println("FizzBuzz");
        }
        else if(no%5==0){
            System.out.println("Fizz");
        }
        else if(no%3==0){
            System.out.println("Buzz");
        }
        else{
            System.out.println(no);
        }
    }
}

