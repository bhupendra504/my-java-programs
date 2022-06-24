import java.util.Scanner;
class prime
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int size,chk=2;
		System.out.println("Enter the size of array:");
		size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the array Element:");
		 	for(int i=0;i<size;i++)
		 {
			 arr[i]=sc.nextInt();
		 }
		 for(int i=0;i<size;i++)
		 {
			for(chk=2;arr[i]>chk;chk++)
			{
				if(arr[i]%chk==0)
				{
					System.out.println("Not prime number:"+arr[i]);
					break;
				}
			}
				if(arr[i]==chk)
				{
					System.out.println("prime number:" +arr[i]);
				}
			
		 }
	}
}
		 
		 
		 
			 