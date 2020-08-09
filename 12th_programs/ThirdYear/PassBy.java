package ThirdYear;


/**
 * Write a description of class PassBy here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PassBy
{
    public static void main(String args[])
    {
        int a = 5, b=7;
        print(a,b);
        System.out.println(a+" "+b);
    }
    
    public static void print(int a, int b)
    {
        a=15;
        b=25;
    }
    
}

class Test { 
    public Integer value; 
  
    Test(int value) 
    { 
  
        // Using wrapper class 
        // so as to wrap integer value 
        // in mutable object 
        // which can be changed or modified 
        this.value = value; 
    } 
  
    @Override
    public String toString() 
    { 
        return String.valueOf(value); 
    } 
} 
  
class Main { 
    public static void modification(Test x) 
    { 
        x.value = 1000; 
    } 
  
    public static void main(String[] args) 
    { 
        Test k = new Test(50); 
        modification(k); 
  
        // Modified value gets printed 
        System.out.println(k); 
    } 
} 
