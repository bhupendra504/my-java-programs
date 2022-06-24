import java.util.Scanner;
class add
{
public static void Total(int arr[],int size)
{
int sum=0;
for(int i=0;i<size;i++)
{
sum=sum+arr[i];
}
System.out.println("Total sum of all element :"+sum);
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int size;
System.out.println("Enter the size of Array");
size=sc.nextInt();
int arr[]=new int[size];
System.out.println("Enter the Array element");
for(int i=0;i<size;i++)
{
arr[i]=sc.nextInt();
}
add.Total(arr,size);
}
}