public class pattern1
{
    public static void main (String args[])
    {
        int i,j,k,m=5;
        System.out.println("The required pattern:");
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=m;j++)
                System.out.print(" ");
            for(k=1;k<=i;k++)
                System.out.print("a ");
            System.out.println();
            m=m-1;
        }

        m=2;
        for(i=4;i>=1;i--)
        {
            for(j=1;j<=m;j++)
                System.out.print(" ");
            for(k=1;k<=i;k++)
                System.out.print("a ");
            System.out.println();
            m=m+1;
        }
    }
}
