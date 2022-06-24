import java.util.*;
class prog
{
public static void main(String args[])
{
LinkedList<String>data=new LinkedList<String>();
data.add("Apple");
data.add("Mange");
data.add("Orange");
data.add("Grapes");
Iterator itr=data.iterator();
while(itr.hasNext())
{
System.out.println("Item  :"+itr.next());
}
itr.remove();
System.out.println("--------------");
for(String d:data)
{
System.out.println("Item :"+d);
}
}
}