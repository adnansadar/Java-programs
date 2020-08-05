package ThirdYear;
import java.util.Scanner;

/** /Class is a blueprint of an object as it defines its properties and behaviour
through local variables and member methods*/
class Employee{ //doesnt have an access specifier
    int empid;
    double salary;
    static String ceo;//ceo remains constant for both objects Adnan and Zaid
    static{ // use a static block to intialise static variables as
        //its called only once when the class is loaded.
        ceo = "Jatan";
        System.out.println("In static block.");
    }

    public Employee(){ //Constructor is called each time an object is created
        //default values set for every new employee.
        System.out.println("In constructor block.");
        empid = 1;
        salary = 30_000;
    }

    void show()
    {
        System.out.println(empid+" "+salary+" "+ceo);
    }
}

public class Constructors
{    
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        Employee Adnan = new Employee();
        Employee Zaid = new Employee();
        Adnan.empid=9;
        Zaid.empid=11;
        Adnan.salary=50_000;
        Adnan.ceo="Angelo";
        Zaid.salary=70_000;
        //Employee.ceo="Jatan";//for static variables you can directly use classname
        //to set the value as it remains constant for all objects.
        Zaid.show();
        Adnan.show();
    }
}
