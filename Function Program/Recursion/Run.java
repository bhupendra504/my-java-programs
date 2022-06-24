import java.util.Scanner;
class Prog{
	
	public static int Run(int a, int b){
		System.out.println("First Number is  : "+a);
		System.out.println("Second Number is  : "+b);
		return a+b;
	}
	
	public static void main(String args[]){
		Scanner scan  = new Scanner(System.in);
		int run = Prog.Run(scan.nextInt(),scan.nextInt());
		System.out.println("Sum is  : "+run);
	}
}	