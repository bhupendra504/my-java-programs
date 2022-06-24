import java.util.Scanner;
class Prog{
	public static int multi(int a,int b){
		if(b>0)
		return a*multi(a,--b);
		else
		return 1;
	}
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter base");
		int a,b;
		a=scan.nextInt();
		System.out.println("Enter power of base");
		b=scan.nextInt();
		int sum=Prog.multi(a,b);
		System.out.println("value is : "+sum);
	}
}
