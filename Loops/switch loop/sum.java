import java.util.Scanner;
class sum
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int a,b;
	int n;
	System.out.println("press 1 for sum");
	System.out.println("press 2 for subtraction");
	n=sc.nextInt();
	
	
	switch(n)
	{
	case 1:
	int sum;
	System.out.print("Enter 1st no:");
	a=sc.nextInt();
	System.out.println("Enter 2nd no:");
	b=sc.nextInt();
	sum=a+b;
	System.out.println("sum is" +sum);
	break;
	
	case 2:
	
	int sub;
	System.out.print("Enter 1st no:");
	a=sc.nextInt();
	System.out.println("Enter 2nd no:");
	b=sc.nextInt();
	sub=a-b;
	System.out.println("sub is" +sub);
	break;
}
}
}
	
	
	
	
	
	
	
	

	
	
	

		
		
	