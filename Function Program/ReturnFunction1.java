import java.util.Scanner;
class progs
{
	public static int add(int a,int b){
		
		return a+b;
	}
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Sum Program");
		System.out.println("Enter two number");
		int a,b;
		a=scan.nextInt();
		b=scan.nextInt();
		int sum=Prog.add(a,b);
		System.out.println("Sum is "+sum);
	}
}