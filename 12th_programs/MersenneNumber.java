/** Mersenne Numbers are ones which are oe less than the power of 2
 *  That is 1,(2^1)-1,(2^2)-1,(2^3)-1.... Sum of mesenne nos are
 *  1,3,7,15,31,63,127... A double mersenne no is of the form:
 *  2^(2^n-1)-1.Double mersenne nos are 1,7,127,32767,2147483647...
 */
class MersenneNumber
{
    public void MersenneNos(int n)
    {
        int flag=0;
        long num=0,pwr;
        for(int i=1;i<n;i++)
        {
            pwr=(long)(Math.pow(2,i)-1);
            if(n==pwr)
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
            System.out.println("The number "+n+" is a mersenne number");
        else
            System.out.println("The number "+n+" is not a mersenne number");
    }
}