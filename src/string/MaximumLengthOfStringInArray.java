package string;

public class MaximumLengthOfStringInArray 
{
	public static void main(String[] args) 
	{
		String[] str = {"a", "b", "ab", "abc", "def", "abcd", "abcde", "efgjh", "spoorthy", "reagan", "alia"};
		String maxLenght = str[0];
		for(int i=1; i<str.length; i++)
		{
			if(maxLenght.length() < str[i].length())
			{
				maxLenght = str[i];
			}
		}
		for(int i=0; i<str.length; i++)
		{
			if(maxLenght.length()==str[i].length())
			{
				  System.out.println(str[i]);
			}
		}
		
		
		
		
		/*String maxLenght = str[0];
		for(int i=1; i<str.length; i++)
		{
			if(maxLenght.length() < str[i].length())
			{
				maxLenght = str[i];
			}
		}
		for(int i=0; i<str.length;i++)
		{
			if(maxLenght.length() == str[i].length())
			{
				System.out.println(str[i]);
			}
		}
		
		
		
		
		for(int i=0; i<str.length; i++)
		{
			for(int j=i+1; j<str.length; j++)
			{
				if(str[i].length() > str[j].length())
				{
					String temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
			}
		}
		System.out.println(str[str.length-1]);*/
	}
}