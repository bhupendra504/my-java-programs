import java.util.Scanner;
class fibonacci
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the term");
		int a=0,b=1,term,c;
		int i=1;
		term=sc.nextInt();
		while(i<=term)
		{
			System.out.println(a+" ");
			i++;
			c=a+b;
			a=b;
			b=c;
		}
	}
}
		