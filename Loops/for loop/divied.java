import java.util.Scanner;
class divied
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
    int	a,b,c;
	a=sc.nextInt();
	b=sc.nextInt();
	for(c=0;a>=b;c++)
	{
		a=a-b;
	}
	System.out.println(" qut  :"+c);
	System.out.println(" rem  :"+a);
	}
}

	
		
		