import java.util.*;
public class hd{
public static void main(String args[]){
HashSet<String> h=new HashSet<String>();
h.add("qww");
h.add("adasd");
h.add("khdkj");

Iterator<String> itr=h.iterator();
while(itr.hasNext()){
System.out.println(itr.next());
}}}