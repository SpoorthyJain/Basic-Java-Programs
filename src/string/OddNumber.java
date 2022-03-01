package string;

public class OddNumber 
{

	public static void main(String[] args)
	{
		String  str = "8095979950";
		
		for(int i=0;i<=str.length()-1;i++)
		{
			if(str.charAt(i)>='0' && str.charAt(i)<='9')	
			{
				int num = str.charAt(i)-48;
				if(num%2==1)
				{
					System.out.print(str.charAt(i)+" ");
				}
			}
		}
	}
}