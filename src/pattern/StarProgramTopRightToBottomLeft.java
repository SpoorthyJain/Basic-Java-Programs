package pattern;

public class StarProgramTopRightToBottomLeft 
{
	public static void main(String[] args) 
	{
		int space = 3;
		int star = 1;
		int row = 4;
		int i = 0, j = 0;
		
		if(i==0 && i==3 && j==0 && j==3)
		{
			for(i=0; i<row; i++)
			{
				for(j=0; j<space; j++)
				{
					System.out.print(" ");
				}
				for(int k=0; k<star; k++)
				{
					System.out.print("*");
				}
				System.out.println( );
				star++;
				space--;
			}
		}
	}
}