import java.io.*;
class ConvertToWords
{
    int n;
    public void convertToWords()
    {
        n=0;
    }

    public void inpnum()throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number: ");
        n=Integer.parseInt(in.readLine());
        num_to_words(n);
    }

    public int extdigit(int num)
    {
        if(num==0)
        { 
            return 0;
        }
        else 
        {
            return (num/10);
        }
    }

    public void num_to_words(int n) 
    {
        int dig=extdigit(n);
        if(dig==1)
        {
            switch(n)
            {
                case 10: System.out.println("Ten");
                break;
                case 11: System.out.println("Eleven");
                break;
                case 12: System.out.println("Twelve");
                break;
                case 13: System.out.println("Thirteen");
                break;
                case 14: System.out.println("Fourteen");
                break;
                case 15: System.out.println("Fifteen");
                break;
                case 16: System.out.println("Sixteen");
                break;
                case 17: System.out.println("Seventeen");
                break;
                case 18: System.out.println("Eighteen");
                break;
                case 19: System.out.println("Nineteen");
                break;
            }
        }
        else if(dig>=2&&dig<=9)
        {
            switch(dig)
            {

                case 2: System.out.print("Twenty");
                break;
                case 3: System.out.print("Thirty");
                break;
                case 4: System.out.print("Forty");
                break;
                case 5: System.out.print("Fifty");
                break;
                case 6: System.out.print("Sixty");
                break;
                case 7: System.out.print("Seventy");
                break;
                case 8: System.out.print("Eighty");
                break;
                case 9: System.out.print("Ninety");
                break;
            }
            int dig2=n%10;
            switch(dig2)
            {
                case 0: break;
                case 1: System.out.println("one");
                break;
                case 2: System.out.println("Two");
                break;
                case 3: System.out.println("Three");
                break;
                case 4: System.out.println("Four");
                break;
                case 5: System.out.println("Five");
                break;
                case 6: System.out.println("Six");
                break;
                case 7: System.out.println("Seven");
                break;
                case 8: System.out.println("Eight");
                break;
                case 9: System.out.println("Nine");
                break;
            }
        }
        else
        {
            int dig3=dig/10;
            switch(dig3)
            {

                case 1: System.out.print("one hundred and ");
                break;
                case 2: System.out.print("Two hundred and ");
                break;
                case 3: System.out.print("Three hundred and ");
                break;
                case 4: System.out.print("Four hundred and ");
                break;
                case 5: System.out.print("Five hundred and ");
                break;
                case 6: System.out.print("Six hundred and ");
                break;
                case 7: System.out.print("Seven hundred and ");
                break; 
                case 8: System.out.print("Eight hundred and ");
                break;
                case 9: System.out.print("Nine hundred and ");
                break;
            }
            int dig4=dig%10;
            if(dig4==1)
            {
                switch(n%100)
                {
                    case 10: System.out.println("Ten");
                    break;
                    case 11: System.out.println("Eleven");
                    break;
                    case 12: System.out.println("Twelve");
                    break;
                    case 13: System.out.println("Thirteen");
                    break;
                    case 14: System.out.println("Fourteen");
                    break;
                    case 15: System.out.println("Fifteen");
                    break;
                    case 16: System.out.println("Sixteen");
                    break;
                    case 17: System.out.println("Seventeen");
                    break;
                    case 18: System.out.println("Eighteen");
                    break;
                    case 19: System.out.println("Nineteen");
                    break;
                }
            }
            else
            {
                switch(dig4)
                {

                    case 2: System.out.print("Twenty");
                    break;
                    case 3: System.out.print("Thirty");
                    break;
                    case 4: System.out.print("Forty");
                    break;
                    case 5: System.out.print("Fifty ");
                    break;
                    case 6: System.out.print("Sixty");
                    break;
                    case 7: System.out.print("Seventy");
                    break;
                    case 8: System.out.print("Eighty");
                    break;
                    case 9: System.out.print("Ninety");
                    break;
                }
                int dig5=n%10;
                switch(dig5)
                {
                    case 0: break;
                    case 1: System.out.println("one");
                    break;
                    case 2: System.out.println("Two");
                    break;
                    case 3: System.out.println("Three");
                    break;
                    case 4: System.out.println("Four");
                    break;
                    case 5: System.out.println("Five");
                    break;
                    case 6: System.out.println("Six");
                    break;
                    case 7: System.out.println("Seven");
                    break;
                    case 8: System.out.println("Eight");
                    break;
                    case 9: System.out.println("Nine");
                    break;
                }
            }
        }
    }

    public void main()throws IOException
    {
        ConvertToWords ob = new ConvertToWords();
        ob.inpnum();
    }
}


