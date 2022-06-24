import java.util.Scanner;
class Prog{
	public static int multi(int a,int b){
		
		return a/b;
	}
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two number");
		int multi= Prog.multi(scan.nextInt(),scan.nextInt());
		System.out.println("Answer is : "+multi);
	}
}
