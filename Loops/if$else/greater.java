import java.util.Scanner;
class greater
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.println("Enter the number");
		a=sc.nextInt();
		b=sc.nextInt();
		if(a>b)
		{
			System.out.println("greater number ="+a);
		}
		else
		{
			System.out.println("greater number ="+b);
		}
	}
}