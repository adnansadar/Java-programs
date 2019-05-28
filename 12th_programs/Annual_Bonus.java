import java.io.*;
public class Annual_Bonus
{
    public static void main(String args[])throws IOException
    {
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      int amt,choice;
      double bonus1,bonus2,bonus3;
      System.out.println("-----ANNUAL BONUS CALCULATOR-----");
      do
      {
      System.out.println("\n 1.Officers \n 2.Supervisors \n 3.Workers \n 4.EXIT");
      choice =Integer.parseInt(in.readLine());
        switch(choice)
        {
          case 1:
          System.out.println("Enter the basic amount:");
          amt=Integer.parseInt(in.readLine());
          bonus1= 0.12*amt;
          if (bonus1>50000)
          {
              System.out.println("The Officer's bonus is:Rs 50000");
          }
            else
            {
            System.out.println("The officer's bonus is: Rs " + bonus1);
            }
          break;
          case 2:
          System.out.println("Enter the basic amount: ");
          amt=Integer.parseInt(in.readLine());
          bonus2= 0.10*amt;
          if(bonus2>40000)
          {
              System.out.println("The Supervisors bonus is:Rs 40000");
          }
            else
            {
                System.out.println("The Supervisor's bonus is: Rs " +bonus2);
            }
          break;
          case 3:
          System.out.println("Enter the basic amount: ");
          amt=Integer.parseInt(in.readLine());
          bonus3= 0.0833*amt;
          if(bonus3>30000)
          {
              System.out.println("The Supervisors bonus is:Rs 30000");
          }
            else
            {
                System.out.println("The Supervisor's bonus is: Rs " +bonus3);
            }
          case 4:
          {
            break;
          }
          default:
          System.out.println("Wrong Input value");
        }
    }while (choice!=0);
     }
    }
          

          
            
      