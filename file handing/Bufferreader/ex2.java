import java.io.*;
import java.util.*;
class prog
{
public static void main(String args[]) throws Exception{
FileInputStream f = new FileInputStream("write1.txt");
BufferedInputStream bf = new BufferedInputStream(f);
try{ int i =0; while((i=bf.read())!=-1){
System.out.print((char)i);
}
}
catch(Exception e){
}
finally{

}
}
}