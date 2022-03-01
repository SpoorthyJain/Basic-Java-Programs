package BU;

import java.util.Arrays;

public class Anagram2 
{
		public static void main(String[] args) 
		{
			String x = "ARADHYA";
			String y = "HRADAYA";
			
			char a[] = x.toCharArray();
			char b[] = y.toCharArray();
			
			Arrays.sort(a);
			Arrays.sort(b);
			
			Boolean result = Arrays.equals(a, b);
			
			if(result==true)
			{
				System.out.println("String is Anagram");
			}
			else
			{
				System.out.println("String is not Anagram");
			}
		}
}