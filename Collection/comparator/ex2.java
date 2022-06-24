import java.util.*;
class Student
{
private int id,age;
private String name,city;
Student(int id,String name,String city,int age)
{
this.id=id;
this.name=name;
this.city=city;
this.age=age;
}

public void setId(int id){
this.id=id;
}
public void setName(String name){
this.name=name;
}

public void setCity(String city){
this.city=city;
}
public void setAge(int age){
this.age=age;
}

public int getId(){
return id;
}

public String getName(){
return name;
}

public String getCity(){
return city;
}

public int getAge(){
return age;
}



}
class IdSort implements Comparator
{
public int compare(Object o1,Object o2)
{
Student s1=(Student)o1;
Student s2=(Student)o2;
if(s1.getId()>s2.getId())
{
return 1;
}
else if(s1.getId()==s2.getId())
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
if(s1.getAge()>s2.getAge())
{
return 1;
}
else if(s1.getAge()==s2.getAge())
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
System.out.println("ID : "+st.getId()+"\tName : "+st.getName()+"\tAge : "+st.getAge()+"\tCity : "+st.getCity());
}

Collections.sort(data,new AgeSort());
System.out.println("----------Sorting by Age--------------");
for(Student st:data)
{
System.out.println("ID : "+st.getId()+"\tName : "+st.getName()+"\tAge : "+st.getAge()+"\tCity : "+st.getCity());
}

}
}




 
