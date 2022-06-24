class Bank
{
int amount=20000;
public synchronized void Withdrawl(int amt)
{
System.out.println("Withdrawl process started.......");
if(amt>amount)
{
try
{
wait();
}
catch(Exception e)
{
System.out.println("Exception : "+e);
}
}
amount=amount-amt;
System.out.println("Withdrawl Process Completed.....");
System.out.println("Remainig Balance : "+amount);
}
public synchronized void Deposit(int amt)
{
try
{
System.out.println("Deposit Process Strated......");
amount=amount+amt;
System.out.println("Deposit Process Completed.....");
System.out.println("Updated Balance : "+amount);
notify();
}
catch(Exception e)
{
System.out.println("Exception : "+e);
}
}
}
class Thread1 extends Thread
{
Bank b;
Thread1(Bank b1)
{
this.b=b1;
}
public void run()
{
b.Withdrawl(12000);
}
}
class Thread2 extends Thread
{
Bank b;
Thread2(Bank b1)
{
this.b=b1;
}
public void run()
{
b.Deposit(10000);
}
}

class prog
{
public static void main(String args[])
{
Bank b=new Bank();
Thread1 th1=new Thread1(b);
Thread2 th2=new Thread2(b);
th1.start();
th2.start();

}
}