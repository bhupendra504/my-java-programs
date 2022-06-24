class prog
{
public static void main(String args[])
{
final String res1="Resource 1",res2="Resource 2";
Thread th1=new Thread(){
public void run()
{
synchronized(res1)
{
System.out.println("Thread th1 is used : "+res1);
try
{
Thread.sleep(2000);
}
catch(Exception e)
{

}
synchronized(res2)
{
System.out.println("Thread th1 want to used : "+res2);
}
}

}

};

Thread th2=new Thread(){
public void run()
{
synchronized(res2)
{
System.out.println("Thread th2 is used : "+res2);
try
{
Thread.sleep(2000);
}
catch(Exception e)
{

}
synchronized(res1)
{
System.out.println("Thread th2 want to used : "+res1);
}
}

}

};
th1.start();
th2.start();
}
}