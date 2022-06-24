import java.util.Scanner;
class divisible
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a;
		System.out.println("Enter the number");
		a=sc.nextInt();
		if(a==0)
		{
			System.out.println("divisible");
		}
		else
		{
			System.out.println("Non divisible");
		}
}
}