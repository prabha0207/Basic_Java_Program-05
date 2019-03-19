import java.util.*;

public class Revstring
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String st=sc.next();
		char[] c=st.toCharArray();
		for(int i=c.length-1;i>=0;i--)
		{
		    System.out.print(c[i]);
		}
	}
}
