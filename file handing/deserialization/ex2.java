import java.io.*;
import java.util.*;
class Student implements Serializable {
    int id;
    String name,city;
    Student(int id, String name,String city){
        this.id=id;
        this.name=name;
        this.city=city;
    }
}
class Prog{
    public static void main(String args[]) throws Exception{
        ArrayList<Student> data= new ArrayList<>();
        FileOutputStream fout=new FileOutputStream("Abc.txt");
        ObjectOutputStream obj = new ObjectOutputStream(fout);
        Student st1= new Student(101,"Ashutosh ","Bhopal");
        Student st2= new Student(102,"Aditya ","Bhopal");
        Student st3= new Student(103,"Rahul ","Bhopal");
        Student st4= new Student(104,"Shubham ","Bhopal");
        data.add(st1);
        data.add(st2);
        data.add(st3);
        data.add(st4);
        try{
            obj.writeObject(data);
            System.out.println("Serialization Done ......");

        }
        catch(Exception e){
            System.out.println("Exception :" +e);
        }
        finally{
            obj.close();
            fout.close();
        }
    }
}

