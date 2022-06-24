import java.util.*;
class Student{
     int rollno, age; String name,city;
    Student(int rollno, String name, String city, int age){
        this.age=age;
        this.rollno=rollno;
        this.name=name;
        this.city=city;
    }
}
class Prog{
    public static void main(String args[]){
        LinkedHashSet<Student> data=new LinkedHashSet<Student>();
        Student st1= new Student(101,"Rahul","Bhopal",25);
        Student st2= new Student(102,"Rohit","Indore",24);
        Student st3= new Student(103,"Amar","Ujjain",22);
        Student st4= new Student(104,"Samar","Bhopal",27);
        Student st5= new Student(105,"Umar","Bhopal",26);
        data.add(st1);
        data.add(st2);
        data.add(st3);
        data.add(st4);
        data.add(st5);
        data.add(st1);
        data.add(st2);
        for(Student st:data){
            System.out.println(" Roll No : "+st.rollno+" \tName : "+st.name+" \tCity : "+st.city+"\t Age : "+st.age);
        }
    }
}