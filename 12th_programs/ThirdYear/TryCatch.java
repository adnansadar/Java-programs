package ThirdYear;



public class TryCatch
{
    public static void main(String args[])
    {
        try{
             int i=8/0;
        }
        catch(Exception e){
            System.err.println("Arithmetic Error");
        }
        System.out.println("Arithmetic Error");
    }
}
