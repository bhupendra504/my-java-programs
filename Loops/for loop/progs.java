import java.util.Scanner;
class progs
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
                int inp,range,chk;
		System.out.println("Enter the number");
		range=sc.nextInt();
		for(inp=2;inp<=range;inp++)
		{
			for(chk=2;chk<inp;chk++)
			{
			if(inp%chk==0)
			{
				break;
			}
			if(inp==chk)
			{
				System.out.println("prime "+inp);
			}
			}
		}
	}
}
			
		  