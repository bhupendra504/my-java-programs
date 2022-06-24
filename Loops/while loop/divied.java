import java.util.Scanner;
class divied
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c=0;
		a=sc.nextInt();
		b=sc.nextInt();
		while(a>=b)
		{
			a=a-b;
			c++;
		}
			System.out.println(" qut  :"+c);
	        System.out.println(" rem  :"+a);
	}
}
		
			