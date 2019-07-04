package Inheritance;

class salary extends pay
{
    String date_of_join;
    String date_of_retire;
    salary(String n,String d,double ba,String doj,String dor)
    {
        super(n,d,ba);
        date_of_join=doj;
        date_of_retire=dor;
    }
    }
       