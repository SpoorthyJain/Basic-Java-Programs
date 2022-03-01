package BU;

public class Fibonacci 
{
	public static void main(String[] args) 
	{
		int n=7;
		int firstNum=1, secondNum=1, thirdNum;
		System.out.println(firstNum);
		System.out.println(secondNum);
		for(int i=3; i<=n; i++)
		{
			thirdNum = firstNum + secondNum;
			System.out.println(thirdNum);
			firstNum = secondNum;
			secondNum = thirdNum;
		}
	}
}