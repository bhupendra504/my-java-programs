import java.util.Scanner; 
class test
{
	int a;
	public void fun()
	{
		System.out.println("Funtion of class test");
	}
}
class prog
{
	public static void main(String args[])
	{
test obj=new test();
obj.a=10;
System.out.println("Member variable :"+obj.a);
obj.fun();
	}
}
	