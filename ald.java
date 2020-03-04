import java.util.*;
class ald{
public static void main(String args[]){
ArrayList<Integer> aList=new ArrayList<Integer>();
aList.add(4);
aList.add(6);
aList.add(8);
boolean flag1=aList.contains(6);
if(flag1==true){
System.out.println("alist contains elemenr 2");
}
else
{
System.out.println("alist doesnt contains element 2");
}
boolean flag2=aList.contains(5);
if(flag2==true){
System.out.println("alist contains element 5");
}
else{
System.out.println("a list doesnt contains element 5");
}


}}