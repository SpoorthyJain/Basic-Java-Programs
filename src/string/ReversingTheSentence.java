package string;

public class ReversingTheSentence 
{
	public static void main(String[] args) 
	{
		String s = "welcome to tyss bangalore";	
		String[] sp = s.split(" ");
		for(int i=sp.length-1;i>=0;i--) 
		{
			System.out.print(sp[i]+ " ");
		}
	}
}