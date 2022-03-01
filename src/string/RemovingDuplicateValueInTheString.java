package string;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemovingDuplicateValueInTheString 
{
	public static void main(String[] args) 
	{
		String s = "hello world";
		//HashSet Set = new HashSet<>();
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i=0; i<s.length()-1; i++)
		{
			set.add(s.charAt(i));
		}
		//System.out.println(set);
		
		for(Character ch: set)
		{
			System.out.print(ch+" ");
		}
	}
}