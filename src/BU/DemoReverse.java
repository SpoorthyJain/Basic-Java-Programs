package BU;

import java.util.Iterator;

public class DemoReverse 
{
	String rev = "";
	public static void main(String[] args) 
	{
		System.out.println("Start");
		DemoReverse obj = new DemoReverse();
		String out = obj.reverse("spoor");
		
		System.out.println(out);
		System.out.println("End");
	}
	
	public String reverse(String s)
	{
		for (int i=s.length()-1; i>=0; i--) 
		{
			rev = rev + s.charAt(i);
		}
		return rev;
	}
}