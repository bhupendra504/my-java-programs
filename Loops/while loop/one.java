import java.util.Scanner;
class one
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n;
		int rev=0;
		n=sc.nextInt();
		int i=n;
		while(i>0)
		{
			int rem=i%10;
			rev=(rev*10)+rem;
			i=i/10;
		}
		System.out.println("Reverse:"+rev);
	}
}
			
		
		