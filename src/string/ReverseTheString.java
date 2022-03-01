package string;

public class ReverseTheString 
{
	public static void main(String[] args) 
	{
		//Type-1
		String s = "SPOORTHY";
		for(int i=s.length()-1; i>=0; i--)
		{
			System.out.print(s.charAt(i)+" ");
		}
		System.out.println("");
		
		
		//Type-2
		String reverse = "";
		for(int i=s.length()-1; i>=0; i--)
		{
			reverse = reverse + s.charAt(i);
			System.out.println(reverse);
		}
		System.out.println(reverse);
	}
}