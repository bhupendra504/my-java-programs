import java.util.Scanner;
class progs
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int sum=0;
int arr[][]=new int[2][3];
System.out.println("Enter the Array element");
for(int i=0;i<2;i++)
{
for(int j=0;j<3;j++)
{
arr[i][j]=sc.nextInt();
}
}
System.out.println("-------------------");
for(int i=0;i<2;i++)
{
for(int j=0;j<3;j++)
{
System.out.print(arr[i][j]+"\t");
sum=sum+arr[i][j];
}
System.out.println("\n");
}
System.out.println("Total sum :"+sum);
}
}
