import java.util.*;
class Student
{
int id,age;
String name,city;
char grade;
Student(int id,String name,String city,int age,char grade)
{
this.id=id;
this.name=name;
this.city=city;
this.age=age;
this.grade=grade;
}
}
class prog
{
public static void main(String args[])
{
List<Student>data=new ArrayList<Student>();
Student st1=new Student(101,"Amar","Bhopal",24,'A');
Student st2=new Student(102,"Samar","Bhopal",26,'C');
Student st3=new Student(103,"Umar","Bhopal",25,'B');
data.add(st1);
data.add(st2);
data.add(st3);
data.add(new Student(104,"Rohit","Bhopal",34,'D'));
for(Student st:data)
{
System.out.println("Id :"+st.id+"\tName :"+st.name+"\tCity :"+st.city+"\tAge :"+st.age+"\tGrade :"+st.grade );
}
}
}
