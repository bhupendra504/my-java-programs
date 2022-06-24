import java.util.Scanner;
class bhu
{
	int a,b;
	bhu(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	public void Add()
	{
		System.out.println("Result :"+(a+b));
	}
}
class prog
{
	public static void main(String args[])
	{
		bhu obj=new bhu(34,11);
		obj.Add();
	}
}
