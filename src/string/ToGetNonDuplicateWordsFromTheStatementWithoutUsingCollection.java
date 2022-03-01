package string;

public class ToGetNonDuplicateWordsFromTheStatementWithoutUsingCollection 
{
	public static void main(String[] args) 
	{
		String s = "i am am a a good good boy";
		String[] a = s.split(" ");
		for(int i=0; i<a.length;i++)
		{
			int count = 0;
			for(int j=0; j<a.length;j++)
			{
				if(a[i].equals(a[j]))
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.print(a[i]+" ");
			}
		}
	}
}