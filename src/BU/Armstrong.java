package BU;

public class Armstrong 
{
	public static void main(String[] args)
	{
		int num=153;
		int length=0;
		int t1 =num;
		//for finding length
		while(t1 != 0)
		{
			length = length +1;
			t1=t1/10;
		}
		//multiplying the times of length found
		int t2 = num;
		int rem , arm=0;
		while(t2!=0) 
		{
			int multi=1;
			rem =t2%10;
			for(int i=1;i<=length;i++) 
			{
				multi = multi*rem;
			}
			arm = arm + multi;
			t2=t2/10;
		}
		if(arm == num) 
		{
			System.out.println("It is an armstrong number");
		}
		else 
		{
			System.out.println("It is not a armstrong number");
		}
	}
}
