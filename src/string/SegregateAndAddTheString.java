package string;

public class SegregateAndAddTheString 
{
	public static void main(String[] args) 
	{
		String s = "a1b2c3";
		int sum = 0;
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				char ch = s.charAt(i);
				int num = ch-48;
				sum = sum + num;
			}
		}
		System.out.println("The given string is: "+s);
		System.out.println("Sum of the numbers in the given string is: "+sum);
	}
}