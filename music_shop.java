import java.io.*;
public class music_shop
{
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    /**Main List of items to be printed in columns stored in an array*/
    static int prd_id[]={1,2,3,4,5,6,7,8,9,10,0,0,0,0,0};/**1st column containing id of the
    product you want to buy*/
    static String prd_type[]={"Instrument ","CD         ","Instrument ","Accessories",
        "Accessories","CD         ","Accessories","Instrument ","CD         ","CD         ",
        "","","","",""};/**2nd column: The product types available*/ 
    static String prd_cat[]={"String    ","Rock      ","Keyboard  ","Headphone ","Speaker   ",
        "Pop       ","Earphones ","Percussion","Rock      ","Pop       ","","","","",""};
        /**3rd column: The categories of products*/ 
    static String prd_name[]={"Guitar       ","Living Things","Casio        ","Sennheiser   ",
        "Bose         ","Native       ","Skullcandy   ","Drums        ","Night Visions",
        "1989         ","","","","",""};/**4th column: Product brands or names of CDs*/
    static int prd_cost1[]={1500,500,2500,2000,3500,300,1000,7000,250,550,0,0,0,0,0};
    /**5th column:Product cost*/
    static int prd_qty1[]={4,5,3,6,7,5,8,2,7,10,0,0,0,0,0};/**6th column:Product quantity*/
    /**End of List*/
    static String name[]=new String[20];
    static int sr1[]=new int[20];
    static int qty[]=new int[20];
    static int cost[]=new int[20];
    static int l=0;
    static String type[]=new String[20];
    static int k,conti=0,i,out=0,ch;
    boolean flag;
    static int cent=0,n_prd,total_cost,qty1,new_cost,j,n,id2;
    static music_shop ob=new music_shop();/**Creating an object*/
    static int cno=100;
    static String name1;
    public static void main()throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        do
        {
            System.out.println("\u000c");
            System.out.println("\t\t    Shop On!");
            System.out.println("\t\t    By Mr. Robot.");
            System.out.println();
            System.out.println("\t\t||*****************************************************||");
            System.out.println("\t\t                      MAIN MENU:-");
            System.out.println("\t\t||*****************************************************||");
            System.out.println();
            System.out.println("\t\t    1.New Customer");
            System.out.println("\t\t    2.Enquiry");
            System.out.println("\t\t    3.Buy");
            System.out.println("\t\t    4.Addition");
            System.out.println("\t\t    5.Deletion");
            System.out.println("\t\t    6.Modification");
            System.out.println("\t\t    7.Bill Printing");
            System.out.println("\t\t    8.Report");
            System.out.println("\t\t    9.Exit");
            while(true)
            {
                try
                {
                    System.out.print("\t\t    Enter your choice-->");
                    k=Integer.parseInt(in.readLine());
                    break;
                }
                catch(Exception ob1)
                {
                    System.out.println("\t\t    Wrong Input");
                    System.out.println("\t\t    Please Re-enter");
                    String s=in.readLine();
                    continue;
                }
            }
            switch(k)
            {
                case 1:
                System.out.println("\u000c");
                ob.newcust();
                break;
                case 2:
                System.out.println("\u000c");
                ob.enquiry();
                break;
                case 3:
                System.out.println("\u000c");
                ob.buy();
                break;
                case 4:
                System.out.println("\u000c");
                ob.add();
                break;
                case 5:
                System.out.println("\u000c");
                ob.del();
                break;
                case 6:
                System.out.println("\u000c");
                ob.mod();
                break;
                case 7:
                System.out.println("\u000c");
                ob.bill();
                break;
                case 8:
                System.out.println("\u000c");
                ob.report();
                case 9:
                System.out.println("\u000c");
                ob.exit();
                break;
                default:
                ob.wronginput();
            }
            if(out==0)
            {
                System.out.println();
                System.out.println("\t Enter 1 to continue");
                conti=Integer.parseInt(in.readLine());
            }
        }
        while(conti==1);
        System.out.println("\t\t Thank You!!!");
        System.out.println("\t\t Please visit again");
    }

    void enquiry()throws IOException
    {
        System.out.println("\u000c");
        System.out.println("\t\t   Welcome to Shop On!");
        System.out.println("");
        System.out.println("\t\t   The Products available in the shop");
        System.out.println("\nProduct ID"+"\t"+"Product Type"+"\t"+"Category"+"\t"+"Name"+"\t\t"
        +"Quantity"+"\t"+"Cost");
        System.out.println("Please remember the Product ID of the item you want to purchase!!");
        for(i=0;i<15;i++)
        {
            if(prd_id[i]!=0)
            {
                System.out.println(prd_id[i]+"\t\t"+prd_type[i]+"\t"+prd_cat[i]+"\t"+prd_name[i]
                +"\t"+prd_qty1[i]+"\t\t"+prd_cost1[i]);
            }
        }
    }

    void buy()throws IOException
    {

        while(true)
        {
            try
            {
                System.out.println("\u000c");
                System.out.println("\t\t Enter the Product ID-->");
                ch = Integer.parseInt(in.readLine());
                break;
            }
            catch(Exception ob1)
            {
                System.out.println("\t\t    Wrong Input");
                System.out.println("\t\t    Please Re-enter");
                int s = Integer.parseInt(in.readLine());
                continue;
            }
        }
        int lb=0,ub=9;
        while(ub>=lb)
        {
            cent=(ub+lb)/2;
            if(prd_id[cent]==ch)
            {
                flag = true;
                break;
            }
            else if(prd_id[cent]<=ch)
            {
                lb = cent+1;
            }
            else
            {
                ub = cent-1;
            }
        }
        ub = 0;
        lb = 9;
        ob.delay();
        if(flag==true)
        {
            System.out.println("\t\t -------Search succesfull-------");
            System.out.println("\nProduct ID"+"\t"+"Product Type"+"\t"+"Category"+"\t"+"Name"
            +"\t\t"+"Quantity"+"\t"+"Cost");
            System.out.println(prd_id[cent]+prd_type[cent]+prd_cat[cent]+prd_name[cent]
            +prd_qty1[cent]+prd_cost1[cent] + "\n");
            System.out.println("--------------------------------------------------------------");
            while(true)
            {
                System.out.println("\t\t Enter the product quantity:");
                qty1=Integer.parseInt(in.readLine());
                if(qty1>prd_qty1[cent])
                {
                    System.out.println("\t\t Only "+prd_qty1[cent]+" number of items  are avialble");
                    System.out.println("\t\t Please re-enter-->");
                    continue;
                }
                else
                {
                    break;
                }
            }
            total_cost=total_cost+(prd_cost1[cent]*qty1);
            prd_qty1[cent]=(prd_qty1[cent]-qty1);
        }
        else
        {
            System.out.println("\t\t Search Unsuccessful!");
            System.out.println("\t\t Product not available!!");
            System.out.println();
            System.out.println("\t\t Do you want to continue(1/2)");
            conti=Integer.parseInt(in.readLine());
        }
        if(conti==1)
        {
            ob.main();
        }
        if(conti==2)
        {
            ob.exit();
        }
    }

    void add()throws IOException
    {

    }

    void del()throws IOException
    {
        System.out.println("Enter the Product ID:");
        id2=Integer.parseInt(in.readLine());
        prd_id[id2]=0;
        prd_type[id2]="del";
        prd_cat[id2]="del";
        prd_name[id2]="del";
        prd_cost1[id2]=0;
        prd_qty1[id2]=0;
    }

    void mod()throws IOException
    {
        System.out.println("Enter 1. Quantity");
        System.out.println("      2. Cost");
        n=Integer.parseInt(in.readLine());
        if(n==1)
        {
            System.out.println("Enter the Product ID:");
            int id=Integer.parseInt(in.readLine());
            for(i=0;i<prd_id.length;i++)
            {
                if(id==prd_id[i])
                {
                    System.out.println("Enter the qty to modify:");
                    prd_qty1[i]=Integer.parseInt(in.readLine());
                }
            }
        }
        if(n==2)
        {
            System.out.println("Enter the Product ID:");
            int id=Integer.parseInt(in.readLine());
            for(i=0;i<prd_id.length;i++)
            {
                if(id==prd_id[i])
                {
                    System.out.println("Enter the cost to modify:");
                    prd_cost1[i]=Integer.parseInt(in.readLine());
                }
            }
        }
    }
    void bill()throws IOException
    {
        ob.delay();
        System.out.println("\t\t Total Cost= Rs"+total_cost);
        if(total_cost>=10000)
        {
            System.out.println("Dear Customer your total cost exceeds 10000 so you will get a discount of 10%");
            System.out.println("on your transaction");
            new_cost=total_cost-(10*total_cost)/100;
            System.out.println("\t\t Your new amount=Rs"+new_cost);
        }

    }

    void report()throws IOException
    {

    }

    void exit()throws IOException
    {
        conti=0;
        out=1;

    }

    void wronginput()throws IOException
    {
        System.out.println("\t\t Invalid input!!");
    }

    void delay()throws IOException
    {
        int i,j;
        String bar="";
        int l=0;
        int k=0;
        for(i=0;i<1000000000;i++)
        {
            System.out.println("\t\t\t\f");
            System.out.println("\t\t\t Please wait");
            System.out.println("\t\t\t Your transaction is being processed........");
            System.out.println("\t\t loading"+bar);
            System.out.println("\t\t\t");
            System.out.println("\t\t\t\t\t      "+l+"%");
            System.out.println("\t\t\t");
            l=l+5;
            bar=bar+"...";
            k++;
            for(j=0;j<50000000;j++)
            {
            }
            if(k>20)
            {
                break;
            }
        }
        bar="";
        l=0;k=0;
    }

    void newcust()throws IOException
    {
        cno++;
        System.out.println("Your Customer number:"+cno);
        System.out.println("Enter your name:");
        name1=in.readLine();
    }
}
