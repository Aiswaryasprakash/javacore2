import java.util.*;
class core4{
static int objs=0;
{
objs=objs+1;
}
core4()
{}
core4(int n)
{
}
core4(String s)
{
}
public static void main(String[] args)
{
core4 t=new core4();
core4 t1=new core4(6);
core4 t3=new core4("a");
System.out.println(core4.objs);
}}
