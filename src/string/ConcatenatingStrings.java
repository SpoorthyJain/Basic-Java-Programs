package string;

public class ConcatenatingStrings 
{
	public static void main(String[] args) 
	{
		String s = "abc" + "xyz"; //expected o/p---->axbycz
		for(int i=0; i<s.length()/2; i++)
		{
			System.out.print(s.charAt(i)+""+ s.charAt(s.length()/2+i));
		}
	}
}