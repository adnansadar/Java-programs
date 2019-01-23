import java.io.*;
public class Your_choice
{
    public static void main(String args[])throws IOException
    {
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      int l,b,r,choice;
      double ar,cir;
      System.out.println("Enter: \n 1.To find area of circle \n 2.To find area of rectangle \n 3.To find circumference of circle \n 4.To find area of square.");
      choice= Integer.parseInt(in.readLine());
      switch(choice)
      {
          case 1:
          System.out.println(" Area of circle: ");
          System.out.println(" Enter the radius of circle.");
          r=Integer.parseInt(in.readLine());
          ar=(double)22/7*r*r;
          System.out.println(" Area of circle is: " +ar);
          break;
          case 2:
          System.out.println(" Area of rectangle");
          System.out.println(" Enter the length and breadth of the rectangle.");
          l=Integer.parseInt(in.readLine());
          b=Integer.parseInt(in.readLine());
          ar=(double)l*b;
          System.out.println(" Area of rectangle is: " +ar);
          break;
          case 3:
          System.out.println(" Circumference of circle:");
          System.out.println("Enter the radius of the circle.");
          r=Integer.parseInt(in.readLine());
          cir=(double)2*22/7*r;
          System.out.println(" Circumference of circle is :" +cir);
          break;
          case 4:
          System.out.println(" Area of square:");
          System.out.println(" Enter the length of the side of a square.");
          l=Integer.parseInt(in.readLine());
          ar=(double)l*l;
          System.out.println(" Area of Square is: " +ar);
          break;
        }
    }
}
          
          
          
      