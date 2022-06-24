import java.util.*;
class Student
{
int id;
String name,city;
Student(int id,String name,String city)
{
this.id=id;
this.name=name;
this.city=city;
}
}
class prog
{
public static void main(String args[])
{
List<Student>data=new ArrayList<Student>();
Student st1=new Student();
Student st2=new Student();
Student st3=new Student();
data.add(st1);
data.add(st2);
data.add(st3);
for(Student st:data)
{
System.out.println("Id :"+st.id+"\tName :"+st.name+"\tCity :"+st.city );
}
}
}
