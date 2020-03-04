import java.text.SimpleDateFormat;  
import java.util.Date;  
public class ddd {  
public static void main(String[] args)throws Exception {  
    String s="31/12/1998";  
    Date d=new SimpleDateFormat("dd/MM/yyyy").parse(s);  
SimpleDateFormat sdr=new SimpleDateFormat("EEEE");
String str=sdr.format(d);

    System.out.println(str);  
}  
} 


