import java.util.Scanner;
class vowel2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String n;
		System.out.println("Enter the character");
		n=sc.nextLine();
		char ch=n.charAt(0);
		switch(ch)
		{
			case 'a':
			System.out.println("vowel");
			break;
		
		    case 'e':
			System.out.println("vowel");
			break;
	
	        case 'o':
			System.out.println("vowel");
			break;

            case 'u':
			System.out.println("vowel");
			break;

			case 'i':
			System.out.println("vowel");
			break;
			default:
			System.out.println("consonent");
			break;
		}
	}
}
			
			
			
			
		