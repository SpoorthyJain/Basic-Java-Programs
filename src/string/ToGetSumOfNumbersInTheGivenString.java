package string;

public class ToGetSumOfNumbersInTheGivenString 
{
	public static void main(String[] args) 
	{
		String s="3e18f3nd10";
		int sum=0;
		int Tsum=0;
		for(int i=0;i<s.length();i++) 
		{
			if(s.charAt(i)>='0' && s.charAt(i)<='9') 
			{
				int n=s.charAt(i)-48;
				sum=sum*10+n;
			}
			else 
			{
				Tsum=Tsum+sum;
				sum=0;
			}
		}
		Tsum=Tsum+sum;
		System.out.println(Tsum);
	}
}