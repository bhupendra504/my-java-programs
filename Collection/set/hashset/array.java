  import java.util.*;
class Prog{
    public static void main(String args[]){
       ArrayList<String> data = new ArrayList<String>();
        data.add("Amar");
        data.add("Samar");
        data.add("Rahul");
        data.add("Amar");
        data.add("Samar");

        Iterator itr=data.iterator();
        while(itr.hasNext()){
            System.out.println("Name : "+itr.next());
        } 
        System.out.println("----Hashset Data Add-------");
        HashSet<String> data1=new HashSet<String>();
        data1.addAll(new HashSet(data));
        Iterator itr1=data1.iterator();
        while(itr1.hasNext()){
            System.out.println("Name : "+itr1.next());
        } 
    }
}