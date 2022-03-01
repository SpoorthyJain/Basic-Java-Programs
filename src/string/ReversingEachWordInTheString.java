package string;

public class ReversingEachWordInTheString 
{
	public static void main(String[] args) 
	{
		String s = "welcome to tyss bangalore";
		String[] sArray = s.split(" "); //converting to string
		for(int i=0; i<sArray.length; i++)
		{
			String s1 = sArray[i]; //assigning the first element of the array to a ref variable s1 = "welcome"
			for(int j=s1.length()-1; j>=0; j--) //iterate over the string
			{
				System.out.print(s1.charAt(j));
			}
			System.out.print(" ");
		}
	}
}
