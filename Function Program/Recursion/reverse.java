import java.util.Scanner;
class prog
{
  public static void fun(int num,int rev)
{
if(num>0)
{
int rem=num%10;
num=num/10;
rev=(rev*10)+rem;
fun(num,rev);
}
else
{
System.out.println(rev);
}
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num;
System.out.println("Enter num:");
num=sc.nextInt();
prog.fun(num,0);
}
}



