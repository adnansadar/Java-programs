class bubble_sort
{
    public static void main (String args[])
    {
        int i,j,temp=0;
        int Arr[]={5,8,1,3,9,2,56,24,10,4};
        int n=10;
        for (i=0;i<n;i++)
        {
            for(j=1;j<(n-i);j++)
            {
                if(Arr[j-1]>Arr[j])
                {
                    temp=Arr[j-1];;
                    Arr[j-1]=Arr[j];
                    Arr[j]=temp;
                }
            }
        }
        System.out.println("The list after sorting:");
        for(int k=0;k<10;k++)
        {
            System.out.print(Arr[k]+" ");
        }
    }
}

