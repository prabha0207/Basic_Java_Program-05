import java.util.Scanner;

public class NumberReverse 
{
	public static void main(String[] args)
  {
		Scanner sc=new Scanner(System.in);
		int n1,a1,num=0;
		n1=sc.nextInt();
		while(n1!=0)
    {
			a1=n1%10;
			num=num*10+a1;
			n1=n1/10;
		}
		System.out.print(num);
		
	}

}
