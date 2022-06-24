import java.util.Scanner;
class fact
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=1;
		int f=sc.nextInt();
		int i=f;
		while(i>0)
		{
			n=n*i;
			i--;
		}
		{
			System.out.println(n);
			
		}
	}
}
			