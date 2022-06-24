import java.util.Scanner;
class greaterthree
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter the number");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a>b)&&(a>c);
		{
			System.out.println("greater number ="+a);
		}
		if(b>a)&&(b>c);
		{
			System.out.println("greater number ="+b);
		}
		if(c>a)&&(c>b);
		{
			System.out.println("greater number ="+c);
		}
	}
} 