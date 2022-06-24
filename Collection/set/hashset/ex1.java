import java.util.*;
class prog
{
public static void main(String args[])
{
HashSet<String>data=new HashSet<String>();
data.add("Amar");
data.add("samar");
data.add("Rahul");
data.add("Amar");
data.add("Samar");
Iterator itr=data.iterator();
while(itr.hasNext())
{
System.out.println("Item  :"+itr.next());
}
}
}