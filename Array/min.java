import java.util.Scanner;
class min
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int min,max,size;
		System.out.println("Enter the size of array:");
		size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the array Element:");
		arr[0]=sc.nextInt();
	    max=arr[0];
	    min=arr[0];
	
		for(int i=1;i<size;i++)
		{
			arr[i]=sc.nextInt();
			if(arr[i]>max)
			{
				max=arr[i];
			}
			if (arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println("-----------");
		for(int i=0;i<size;i++)
		{
			System.out.println("Arrayof element["+i+"]=" +arr[i]);
		}
		System.out.println("max :" +max);
		System.out.println("min :" +min);
	}
}
		