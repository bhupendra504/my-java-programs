import java.util.Scanner;
class Prog{
	public static int multi(int a,int b){
		if(b>0)
		return a+multi(a,--b);
		else
		return 0;
	}
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two number to add");
		int a,b;
		a=scan.nextInt();
		b=scan.nextInt();
		int sum=Prog.multi(a,b);
		System.out.println("Sum is : "+sum);
	}
}