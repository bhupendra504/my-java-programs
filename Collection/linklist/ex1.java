import java.util.*;
class prog
{
public static void main(String arg[])
{
LinkedList<String>data=new LinkedList<String>();
data.add("Amar");
data.add("Samar");
data.add("Rahul");
data.add("Rohit");
for(String name:data)
{
System.out.println("Name :"+name);
}
data.addFirst("Algorithem");
System.out.println("-----------Begning of the list---------");
for(String name:data)
{
System.out.println("Name :"+name);
}
data.addLast("Apple");
System.out.println("------------Ending of the list");
for(String name:data)
{
System.out.println("Name :"+name);
}
data.add(3,"Dummy");
System.out.println("------------Specific Position of the list-------");
for(String name:data)
{
System.out.println("Name :"+name);
}
}
}
