class Test extends Thread
{
public void run()
{
try
{
for(int i=1;i<=5;i++)
{
System.out.println(Thread.currentThread().getName()+"is counting:"+i);
Thread.sleep(3000);
}
}
catch(Exception e)
{
System.out.println("Exception :"+e);
}
}
}
class prog
{
public static void main(String args[])
{
Test th1=new Test();
Test th2=new Test();
th1.setName("Thread-01");
th2.setName("Thread-02");
try
{
th1.start();
th1.join();
}
catch(Exception e)
{

}
th2.start();
}
}
