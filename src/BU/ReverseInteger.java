package BU;

public class ReverseInteger 
{
	public static void main(String[] args) 
	{
		int n = 5432;
		int remainder;
		int reverse = 0;
		while(n!=0)
		{
			remainder = n%10;
			reverse = reverse*10 + remainder;
			n = n/10;
		}
		System.out.println(reverse);
	}
}