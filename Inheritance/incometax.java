package Inheritance;

class incometax extends employee1
{
    double da,hra,gross=0,ansal,tax,scharge=0;
     
    void calculate()
    {
        da=50/100*super.basic;
        hra=15/100*super.basic;
        gross=super.basic+da+hra;
    }

    void compute()
    {
        ansal=gross*12;
        if(ansal<=100000)
            tax=0;
        if(ansal>100000 && ansal<=150000)
            tax=(ansal-100000)*0.1;
        if(ansal>150000 && ansal<=250000)
            tax=(ansal-150000)*0.2;
        if(ansal>250000)
            scharge=(ansal-1000000)*0.1;
    }

    void display()
    {
        employee1 ob=new incometax();
        ob.showdata();
        System.out.println("Dearness Allowance: " +da);
        System.out.println("House Rent Allowance: " +hra);
        System.out.println("Gross Salary: " +gross);
        System.out.println("Annual Salary: " +ansal);
        System.out.println("Income Tax: " +tax);
        System.out.println("Surcharge: " +scharge);
    }
}
