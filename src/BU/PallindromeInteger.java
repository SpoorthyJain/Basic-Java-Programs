package BU;

public class PallindromeInteger 
{
	public static void main(String[] args) 
	{
		int num = 35653;
		int reverse = 0;
		int remainder;
		int originalNum = num;
		while(num!=0)
		{
			remainder = num%10;
			reverse = reverse*10 + remainder;
			num = num/10;
		}
		if(originalNum == reverse)
		{
			System.out.println("Number is pallindrome");
		}
		else
		{
			System.out.println("Number is not pallindrome");
		}
	}
}