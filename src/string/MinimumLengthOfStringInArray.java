package string;

public class MinimumLengthOfStringInArray 
{
	public static void main(String[] args) 
	{
		String[] str = {"spoorthy", "reagan", "alia", "blue", "gunda"};
		String minLenght = str[0];
		for(int i=1; i<str.length; i++)
		{
			if(minLenght.length() > str[i].length())
			{
				minLenght = str[i];
			}
		}
		for(int i=0; i<str.length; i++)
		{
			if(minLenght.length()==str[i].length())
			{
				  System.out.println(str[i]);
			}
		}
	}
}