class Student
{
private int roll_no;
private String name,city;
Student()
{
roll_no=0;
name="";
city="";
}
public void setRoll(int roll_no)
{
this.roll_no=roll_no;
}
public void setName(String name)
{
this.name=name;
}
public void setCity(String city)
{
this.city=city;
}
public int getRoll()
{
return roll_no;
}
public String getName()
{
return name;
}
public String getCity()
{
return city;
}
}
class prog
{
public static void main(String args[])
{
Student st=new Student();
st.setRoll(102); 
st.setName("Amar pal");
st.setCity("bhopal");
System.out.println("---------------");
System.out.println("Roll No: "+st.getRoll());
System.out.println("Name   : "+st.getName());
System.out.println("City   : "+st.getCity());
}
}