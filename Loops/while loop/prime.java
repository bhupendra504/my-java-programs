import java.util.Scanner;
class prime
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,chk=2;
		System.out.println("Enter the number");
		a=sc.nextInt();
		while(a>chk)
		{
			if(a%chk==0)
			{
				System.out.println("not prime");
				break;
		}
		chk++;
	}
	  if(a==chk)
	  {
		  System.out.println("prime");
	  }
}
}
