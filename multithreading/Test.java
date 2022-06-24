import java.util.Scanner;
class Test
{
public synchronized void PrintTable(int n)
{
try
{
for(int i=1;i<=5;i++)
{
System.out.println("Table of : "+(n*i));
Thread.sleep(4000);
}
}
catch(Exception e)
{
System.out.println("Exception : "+e);
}
}
}
class Thread1 extends Thread
{
Test t;
Thread1(Test t1)
{
this.t=t1;
}
public void run()
{
t.PrintTable(5);
}
}

class Thread2 extends Thread
{
Test t;
Thread2(Test t1)
{
this.t=t1;
}
public void run()
{
t.PrintTable(7);
}
}
class prog
{
public static void main(String args[])
{
Test obj=new Test();
Thread1 th1=new Thread1(obj);
Thread2 th2=new Thread2(obj);
th2.start();

th1.start();
}
}