import java.util.Scanner;
class sum
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int size,sum=0;
		System.out.println("Enter the number");
		size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the element of sum");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("---------------------------------------");
		for(int i=0;i<size;i++)
		{
		  System.out.println("Array Element["+i+"]="+arr[i]);
		  sum=sum+arr[i];
		}
		System.out.println("sum :"+sum);
	}
}
		