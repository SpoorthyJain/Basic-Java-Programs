package string;

import java.util.LinkedHashSet;

public class ToGetNonDuplicateWordsFromTheStatement 
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
			int count = 0;
			for(int i=0; i<sArray.length; i++)
			{
				if(word1.equals(sArray[i]))
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.println(word1);
			}
		}
	}
}