import java.util.Scanner;
class vowel
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
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			System.out.println("vowel");
			break;
			default:
			System.out.println("consonent");
			break;
		}
	}
}
			
		