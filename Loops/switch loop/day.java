import java.util.Scanner;
class day
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the number");
	    n=sc.nextInt();
		switch(n)
		{
			case 1:
			System.out.println("sunday");
			break;
			
		  case 2:
			System.out.println("monday");
			break;
			
		    case 3:
			System.out.println("wednesday");
			break;
			
		   case 4:
			System.out.println("thursday");
			break;
			
		   case 5:
			System.out.println("friday");
			break;
			
			case 6:
			System.out.println("saturday");
			break;
			
			case 7:
			System.out.println("sunday");
			break;
			
			default:
			System.out.println("invaid day range");
			break;
		}
	}
}
	
		
		
		
		