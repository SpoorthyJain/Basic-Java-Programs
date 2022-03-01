package pattern;

public class StarProgramTopLeftToBottomRight 
{
	public static void main(String[] args) 
	{
		int star = 1;
		int row = 4;
		
		for(int i=0; i<=row; i++)
		{
			for(int j=0; j<star; j++)
			{
				System.out.print("* ");
			}
			System.out.println( );
			star++;
		}
	}
}