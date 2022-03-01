package string;

public class ReverseTheStringWithoutUsingLengthMethod 
{
	public static void main(String[] args) 
	{
		String s = "REAGAN";
		char[] sArray = s.toCharArray();
		for(int i=sArray.length-1; i>=0; i--)
		{
			System.out.print(sArray[i]+" ");
		}
		System.out.println("");
		
		
		//Type-1--->To find the length
		int count = 0;
		for(char ch: sArray)
		{
			count++;
		}
		System.out.println("Lenght of the given string: "+count);
		for(int i=count-1; i>=0; i-- )
		{
			System.out.print(sArray[i]+" ");
		}
		System.out.println("");
		
		//Type-2--->To find the length
		String s2 = "";
		int length = s.compareTo(s2);
		System.out.println("Length of the string using compareTo: "+length);
	}
}