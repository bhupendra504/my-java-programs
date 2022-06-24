import java.util.Scanner;
class swap
{
	int a,b;
	swap(int a,int b)
	{
		this.a=a;
		this.b=b;
		System.out.println("value of 1st variable : "+a);
		System.out.println("value of 2st variable : "+b);
		System.out.println("");
	    System.out.println("");	
	}
	public void swap()
	{
	  a=a+b;
	  b=a-b;
	  a=a-b;
	  System.out.println("values after swapping");
	  System.out.println("--------------");
	  System.out.println("value of 1st variable :"+a);
	  System.out.println("value of 2st variable :"+b);
	}
}
class prog{
	public static void main(String args[])
	{
    System.out.println("Enter two Integer values");
    Scanner sc=new Scanner(System.in);
    swap obj=new swap(sc.nextInt(),sc.nextInt());
	obj.swap();
}
}

	  
	  