import java.util.Scanner;
class A
{
public static  void Divide(int a,int b)
{
System.out.println("Result :"+(a/b));
}
}
class B extends A
{

}
class prog
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,b;
try
{
System.out.println("Enter the number");
a=sc.nextInt();
b=sc.nextInt();
B obj=new B();
obj.Divide(a,b);
}
catch(Exception e)
{
System.out.println("Exception  :"+e);
}
}
}



