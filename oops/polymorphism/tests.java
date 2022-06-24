 import java.util.Scanner;
class tests
{
public void fun()
{
System.out.println("Hello by fun function");
}
public void fun(int a,int b)
{
System.out.println("Result :"+(a+b));
}
public void fun(float a,float b)
{
System.out.println("Result :"+(a+b));
}

}
class prog
{
public static void main(String args[])
{
tests obj=new tests();
obj.fun();
obj.fun(12f,12f);
obj.fun(12,23);
}
}