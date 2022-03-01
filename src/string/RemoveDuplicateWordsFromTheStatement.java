package string;

import java.util.LinkedHashSet;

public class RemoveDuplicateWordsFromTheStatement 
{
	public static void main(String[] args) 
	{
		String s = "hello welcome hello world welcome to test yantra";
		String[] sArray = s.split(" ");
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for(String word: sArray)
		{
			set.add(word);
		}
		
		for(String word1: set)
		{
			System.out.println(word1);
		}
	}
}