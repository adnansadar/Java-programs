package ThirdYear;
import java.util.Scanner;

//If no entered by user is divisible by 5 print Fizz, div by 3 print Buzz, if div by both print FizzBuzz else print the no entered by the user.
public class UserInput
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str1;
        System.out.print("Enter a String: ");
        str1 = sc.next().toLowerCase();
        System.out.print(str1);
    }
}

