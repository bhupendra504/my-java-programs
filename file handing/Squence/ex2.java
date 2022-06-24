import java.io.*;
class Prog{
public static void main(String args[]) throws Exception{
FileInputStream fin1=new FileInputStream("Abc.txt");
FileInputStream fin2=new FileInputStream("Abc1.txt");
FileOutputStream fout=new FileOutputStream("New.txt");
SequenceInputStream sin=new SequenceInputStream(fin1,fin2);
try{

int i=0;
while((i=sin.read())!=-1){
fout.write((char)i);
}
System.out.println("Data Write Successfully");

}
catch(Exception e){
System.out.println("Exception :"+e);
}
finally{
fin1.close();
fin2.close();
fout.close();
sin.close();
}
}
}