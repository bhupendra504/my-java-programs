import java.util.Scanner;
class size
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int size;
		System.out.println("Enter the size of array");
		size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the array element");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("-------------------------------");
		for(int i=0;i<size;i++)
		{
			System.out.println("Array Element At index position["+i+"]"+arr[i]);
		}
	
	}
}
