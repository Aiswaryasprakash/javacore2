 class a{
  void dis(){
System.out.println("dis1");
}
  void show(){
System.out.println("show1");
}
}
 class b extends a{
void dis(){
System.out.println("dis");
}}
class c extends b{
void show(){
System.out.println("show");
}}
class test{
public static void main(String[] args)
{
a aa=new c();
//aa.dis();
aa.show();
}}
