package Practice;

class Pattern5
{
    public static void main (String args[])
    {
        int i,j,t,p=11;
        for(i=1;i<=5;i++)
        {
            t=p;
            for(j=1;j<=i;j++)
            {
                System.out.print(t+" ");
                t=t+10;
            }
            p=p+1;
            System.out.println();
        }
    }
}

    