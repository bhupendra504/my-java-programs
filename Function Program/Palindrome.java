import java.util.Scanner;
class palindrome{
	public static int reverse(int a){
		int rev=0;
		while(a>0){
			int rem=a%10;
			rev=rev*10+rem;
			a=a/10;
		}
		return rev;
	}
	public static void main(String args[]){
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number to check Palindrome or not");
		int num=scan.nextInt();
		int rev=Prog.reverse(num);
		if(rev==num){
			System.out.println(num + " is Palindrome");
		}
		else
		System.out.println(num+ " is not a Palindrome");
	}
}