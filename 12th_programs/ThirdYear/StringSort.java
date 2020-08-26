package ThirdYear;

import java.util.*;
public class StringSort{
	public static void main(String[] args) {
		String s = "Adnan";
		char[] str = s.toCharArray();
		Arrays.sort(str);
		String newstr = new String(str);
		System.out.println(newstr);
	}
}