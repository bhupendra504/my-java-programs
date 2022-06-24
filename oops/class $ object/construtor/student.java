import java.util.Scanner;
class student
{
	String name,city;
	int roll;
	student(int rool,String name,String city )
	{
		this.roll=roll;
		this.name=name;
		this.city=city;
		System.out.println("--------orignal constructor------------");
		System.out.println("Roll :"+roll+"\tName :"+name+"\tcity :"+city);
	}
	student(student st)
	{
		this.roll=st.roll;
		this.name=st.name;
		this.city=st.city;
		System.out.println("------------copy constructor----------");
		System.out.println("Roll :"+roll+"\tname : "+name+"\tcity : "+city);
	}
}
class prog
{
	public static void main(String args[])
	{
		student st=new student(101,"Amar","Bhopal");
		student st1=new student(st);
	}
}
	