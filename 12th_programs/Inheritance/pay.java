package Inheritance;

class pay extends employee
{
    String dept;
    double basic;
    pay(String nm,String dpt,double b)
    {
        super(nm);
        dept=dpt;
        basic=b;
    }
}