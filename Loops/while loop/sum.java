import java.util.Scanner;
class sum
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n;
		int i=1;
		int sum=0;
		n=sc.nextInt();
		while(i<=n)
		{
			if(i%3==0)
			{
				System.out.println(i);
				sum=sum+i;
			}
			i++;
		}
		System.out.println("sum of the range="+sum);
	}
}