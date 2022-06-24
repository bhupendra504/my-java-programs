import java.util.*;
class Student
{
int id,age;
String name,city;
Student(int id,String name,String city,int age)
{
this.id=id;
this.name=name;
this.city=city;
this.age=age;
}
}
class IdSort implements Comparator
{
public int compare(Object o1,Object o2)
{
Student s1=(Student)o1;
Student s2=(Student)o2;
if(s1.id>s2.id)
{
return 1;
}
else if(s1.id==s2.id)
{
return 0;
}
else
{
return -1;
}
}
}

class AgeSort implements Comparator
{
public int compare(Object o1,Object o2)
{
Student s1=(Student)o1;
Student s2=(Student)o2;
if(s1.age>s2.age)
{
return 1;
}
else if(s1.age==s2.age)
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

ArrayList<Student> data=new ArrayList<Student>();
data.add(new Student(101,"Amar","Bhopal",34));
data.add(new Student(103,"Umar","Bhopal",27));
data.add(new Student(102,"Rahul","Indore",24));
data.add(new Student(105,"Amar","Bhopal",34));
data.add(new Student(104,"Rohit","Bhopal",38));
Collections.sort(data,new IdSort());
System.out.println("----------Sorting by Id--------------");
for(Student st:data)
{
System.out.println("ID : "+st.id+"\tName : "+st.name+"\tAge : "+st.age+"\tCity : "+st.city);
}

Collections.sort(data,new AgeSort());
System.out.println("----------Sorting by Age--------------");
for(Student st:data)
{
System.out.println("ID : "+st.id+"\tName : "+st.name+"\tAge : "+st.age+"\tCity : "+st.city);
}
}
}

 
