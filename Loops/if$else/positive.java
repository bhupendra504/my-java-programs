import java.util.Scanner;
class positive
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a;
		a=sc.nextInt();
		if(a>0)
		{
			System.out.println("positive number");
		}
		else
		{
			System.out.println("Non positive number");
		}	  
}
}
