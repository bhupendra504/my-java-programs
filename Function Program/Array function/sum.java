import java.util.Scanner;
class sum
{
public static void maxmin(int arr[],int size)
{
int max=arr[0];
int min=arr[0];
for(int i=1;i<size;i++)
{
if(max<arr[i])
{
max=arr[i];
}
if(min>arr[i])
{
min=arr[i];
}
System.out.println("maximum is"+max);
System.out.println("mininum is"+min);
}
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size");
int size=sc.nextInt();
int arr[]=new int [size];
for(int i=0;i<size;i++)
{
arr[i]=sc.nextInt();
}
sum.maxmin(arr,size);
}
} 