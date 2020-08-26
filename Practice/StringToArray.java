import java.util.*;

public class tictactoe 
{
	public static void main(String[] args) 
	{
		String arr[] = new String[40];
		String str = "Adnan is a student \n"+"studying in VIT";
		int i=0;
		for(String val:str.split(" "))
		{
			arr[i]=val;
			System.out.println(arr[i]);
			i++;
		}

	}
}