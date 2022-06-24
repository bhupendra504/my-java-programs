import java.util.Scanner;
class A
{
int a; double b; String c;
A()
{
a=100;b=45.21;c="bhupendra";
}
A(int x)
{
a=x;
}
A(double y,String z)
{
b=y; c=z;
}
}
class B 
{
public static void main(String args[])
{
A obj=new A();
A obj2=new A(10);
A obj3=new A(23.45,"bhupendra");
System.out.println(obj.a+" "+obj.b+" "+obj.c);
System.out.println(obj2.a);
System.out.println(obj3.b+" "+obj3.c);
}
}