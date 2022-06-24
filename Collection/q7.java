import java.util.*;
class prog
{
 public static void main(String args[])
{
List<String>data=new ArrayList<String>();
data.add("Amar");
data.add("Samar");
data.add("Rahul");
data.add("Rohit");
for(String st:data)
{
System.out.println("Name  :"+st);
}
data.remove(2);
System.out.println("-----------Remove Elelment------");
for(String st:data)
{
System.out.println("Name   :"+st);
}
}
}