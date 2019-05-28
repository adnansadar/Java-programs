import java.io.*;
public class Stack_Pointer
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int s[] = new int[20];
        int sp,n;
        Stackpointer(int nn)
        {
            for(int i=0;i<20;i++)
            {
                s[i]=0;
                sp=-1;
                n=m;
            }
            {
                void pushdata(int item)
                {
                if(sp==n-1)

                    System.out.println("Stack Overflow.");
                else
                {
                    sp++;
                    s[sp]=item;
                }
            }

            void popdata(int v)
            {
            int v;
            if(sp==-1){
                System.out.println("Stack Underflow.");
                else
                {
                    v=s[sp];
                    System.out.println("Popped out element" +v);
                    sp--;
                }
            }
            void display()
            {
                if(sp==-1)
                    System.out.println("Stack empty.");
                else
                {
                    for(int i=sp;i>=0;i--)
                    {
                        System.out.println("    " +s[i]);
                    }
                }
            }
        }
    }
}

    
        