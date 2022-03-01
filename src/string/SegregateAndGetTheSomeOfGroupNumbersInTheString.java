package string;

public class SegregateAndGetTheSomeOfGroupNumbersInTheString 
{
	public static void main(String[] args) 
	{
		String s = "a13sr30@#xyz1&55";
		int sum = 0;
		int totalSum = 0;
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				int n=s.charAt(i)-48;
				sum = sum * 10 + n;
			}
			else
			{
				totalSum = totalSum + sum;
				sum = 0;
			}
		}
		System.out.println("Total sum of the numbers are: "+(totalSum+sum));
	}
}