package string;

public class SegregratingAlphabets_SpecialCharAndNumbersFromString 
{
	public static void main(String[] args)
	{
		String s = "aBc@951#";
		String alphabets = " ";
		String numbers = " ";
		String splChar = " ";
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)>='a' && s.charAt(i)<='z' || s.charAt(i)>='A' && s.charAt(i)<='Z')
			{
				alphabets = alphabets + s.charAt(i);
			}
			else if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				numbers = numbers + s.charAt(i);
			}
			else
			{
				splChar = splChar + s.charAt(i);
			}
		}
		System.out.println("Alphabets:"+alphabets);
		System.out.println("Numbers:"+numbers);
		System.out.println("Special Charcaters:"+splChar);
	}
}