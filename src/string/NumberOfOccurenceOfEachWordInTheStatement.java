package string;

import java.util.LinkedHashSet;

public class NumberOfOccurenceOfEachWordInTheStatement 
{
	public static void main(String[] args) 
	{
		String s = "hello world hello all welcome to test yantra";
		String[] sArray = s.split(" ");
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for(String word1: sArray)
		{
			set.add(word1);
		}
		//System.out.println(set);
		
		for(String word1: set)
		{
			int count = 0;
			for(String word2: sArray)
			{
				if(word1.equals(word2))
				{
					count++;
				}
			}
			System.out.println(word1+":"+count);
		}
	}
}
