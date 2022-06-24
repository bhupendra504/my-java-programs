import java.util.Scanner;
class sequre
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int base,expo;
		System.out.println("Enter the value of base");
		base=sc.nextInt();
		System.out.println("Enter the value of exponent");
		expo=sc.nextInt();
		int product=1;
		while(expo>0)
		{
			product=base*product;
			expo--;
		}
		System.out.println(product);
	}
}