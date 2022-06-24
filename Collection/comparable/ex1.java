import java.util.*;
class student implements  Comparable <student>
{
  int id,age;
  String name,city;
  student(int id,String name,String city,int age)
{
  this.id=id;
  this.name=name;
  this.city=city;
  this.age=age;
} 
 public int compareTo(student st) 
{
if(age<st.age)
{
return 1;
}
else if(age==st.age)
{
return 0;
}
if(id>st.id)
{
return 1;
}
else if(id==st.id)
{
return 0;
}
else
{
return -1;
}
}
}
class prog
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
ArrayList<student>data=new ArrayList<student>();
for(int i=1;i<=5;i++)
{
 System.out.println("Enter the id");
int id=sc.nextInt();sc.nextLine();
System.out.println("Enter the Name");
String name=sc.nextLine();
System.out.println("Enter the City");
String city=sc.nextLine();
System.out.println("Enter the Age");
int age=sc.nextInt();sc.nextLine();
student st=new student(id,name,city,age);
data.add(st);

}
Collections.sort(data);
for(student st:data)
{
System.out.println("Id :"+st.id+"\tName :"+st.name+"\tCity :"+st.city+"\tAge :"+st.age);
}
}
}

 