import java.util.Scanner;

class ascending
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int size=sc.nextInt();
		int temp;
		int arr[]=new int[size];
		System.out.println("Enter the Element of Array");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j>size;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[j];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Sorted Array");
		for(int n:arr)
		{
			System.out.println(n);
		}
	}
}