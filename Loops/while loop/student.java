import java.util.Scanner;
class student
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int total class=500;
		int total attended;
		double attendance;
		System.out.println("Enter no.of student:");
		n=sc.nextInt();
		int i=1;
		while(i<=n)
		{
		  System.out.println("Enter classes attended:");
		  total attended=sc.nextInt();
		  attendance=(total attended*100)/total class;
		  System.out.println(attendance);
		  if(attendance>=80)
		  {
			  System.out.println("Grade A");
		  }
		  else if(attendance<80 && attendance>=60)
		  {
			  System.out.println("Grade B");
		  }
		  else if(attendance<60 && attendance>=40)
		  {
			  System.out.println("Grade c");
		  }
		  else 
		  {
			  System.out.println("fail");
		  }
		  i++;
		}
	}
}
} 
			
		
		