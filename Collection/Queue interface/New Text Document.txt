import java.util.*;
class prog{
	public static void main(String args[])
{
	PriorityQueue<String> data = new PriorityQueue<String>();
	data.add("Amar");
	data.add("Samar");
	data.add("Rahul");
	data.add("Umar");
System.out.println("Head :"+data.element());
System.out.println("Head  :"+data.peek());
Iterator itr=data.iterator();
while(itr.hasNext())
{
System.out.println("Item :"+itr.next());
}
}
}