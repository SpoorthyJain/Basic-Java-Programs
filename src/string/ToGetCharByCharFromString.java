package string;

public class ToGetCharByCharFromString 
{
	public static void main(String[] args) 
	{
		String s = "SPOORTHY";
		String reverse = "";
		for(int i=0; i<s.length(); i++)
		{
			reverse = reverse + s.charAt(i);
			System.out.println(reverse);
		}
	}
}