package BU;

public class PallindromeString 
{
	public static void main(String[] args) 
	{
		String s = "Radar";
		String reverse = "";
		for(int i=s.length()-1; i>=0; i--)
		{
			reverse = reverse + s.charAt(i);
		}
		if(s.toLowerCase().equals(reverse.toLowerCase()))
		{
			System.out.println("String is Pallindrome");
		}
		else
		{
			System.out.println("String is not pallindrome");
		}
	}
}