import java.io.*;
import java.util.*;
class Prog{
    public static void main(String args[]) throws Exception{
        FileInputStream fin = new FileInputStream("Abc.txt");
        ObjectInputStream oin = new ObjectInputStream(fin);
        ArrayList<Student> list=new ArrayList<>();
        try{
            list=(ArrayList)oin.readObject();
            for(Student st:list){
            System.out.println("Id : "+st.id+"\tName : "+st.name+"\tCity : "+st.city);
            }
        }
        catch(Exception e){
            System.out.println("Exception :" +e);
        }
        finally{
            oin.close();
            fin.close();
        }
    }
}
        

        

        
        
        
        