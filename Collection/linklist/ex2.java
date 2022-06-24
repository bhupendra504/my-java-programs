 import java.util.*;
class Student implements Comparable<Student>{
int id, age;
String name, city;
Student(int id, String name, String city, int age){
this.id=id;
this.name=name;
this.city=city;
this.age=age;
}
public int compareTo(Student st){
if(age>st.age){
return 1;
}
else if(age==st.age){
if(id>st.id){
return 1;
}
else{
return -1;
}


}

else {
return -1;
}
}
} 
class Prog{
public static void main(String args[]){
LinkedList<Student> data=new LinkedList<Student>();
Student st3=new Student(105,"Rohit","Bhopal",25);
Student st0=new Student(102,"Umar","Bhopal",24);
Student st1=new Student(101,"Amar","Bhopal",25);
Student st2=new Student(103,"Samar","Indore",23);

data.add(st0);
data.add(st1);
data.addFirst(st3);
data.addLast(st2);
for(Student st:data){
System.out.println("Id : "+st.id+ "\tName : "+st.name+"\tCity : "+st.city+"\tAge : "+st.age);
}
System.out.println("----------------After Age sorting----------------------");
Collections.sort(data);


 for(Student st:data){
System.out.println("Id : "+st.id+ "\tName : "+st.name+"\tCity : "+st.city+"\tAge : "+st.age);
}

}
}



