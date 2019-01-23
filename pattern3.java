public class pattern3
{
    public static void main (String args[])
    {
        int i,j,k,l;
        System.out.println("The required pattern:");
        for(i=1;i<=5;i++)
        {
            for (j=1;j<=i;j++)
            {
                System.out.print(j+"\t"+"\t");
            }
            System.out.println();
            System.out.println();
        }
        for(k=4;k>=1;k--)
        {
            for(l=1;l<=k;l++)
            {
                System.out.print(l+"\t"+"\t");
            }
            System.out.println();
            System.out.println();
        }
    }
}