abstract class a{
 abstract void dis();
 abstract void show();
}
public class b extends a{
void dis(){
System.out.println("dis");
}}
public class c extends b{
void show(){
System.out.println("show");
}
public static void main(String[] args)
{
a aa=new c();
aa.dis();
aa.show();
}}
