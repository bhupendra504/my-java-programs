import java.util.Scanner;
class min
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int min,max,inp,i=1;
		System.out.println("Enter the input");
		inp=sc.nextInt();
		max=inp;
		min=inp;
		while(i<=4)
		{
			inp=sc.nextInt();
			if(inp>max)
			{
				max=inp;
			}
			if(inp<min)
			{
				min=inp;
			}
			i++;
		}
		System.out.println("maximum :"+max);
		System.out.println("mininum :"+min);
	}
}
		