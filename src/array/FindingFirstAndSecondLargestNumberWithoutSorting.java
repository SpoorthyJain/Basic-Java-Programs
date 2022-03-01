package array;

public class FindingFirstAndSecondLargestNumberWithoutSorting 
{	
	public static void main(String[] args) 
	{
		int a[] = {2,3,4,5,7,1,6,12,10,11};
		int Fmax = 0;
		int Smax = 0;
		for(int i=0; i<a.length;i++)
		{
			if(Fmax<a[i])
			{
				Smax = Fmax;
				Fmax = a[i];
			}
			else if(Smax<a[i])
			{
				Smax = a[i];
			}
		}
		System.out.println(Fmax+" "+Smax);
	}
}