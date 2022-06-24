import java.util.Scanner;
class prog
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int arr[]=new int[5];
try
{
for(int i=0;i<=5;i++)
{
arr[i]=sc.nextInt();
}
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("Exception :"+e);
}
System.out.println("Rest of the code.....");
}
}