import java.util.*;
class book{
int id;
String name,author,publisher;
int quality;
public book(int id,String name,String author,String publisher,int quality){
this.id=id;
this.name=name;
this.author=author;
this.publisher=publisher;
this.quality=quality;
}

}
public class ald4{
public static void main(String [] args){
List<book>list=new LinkedList<book>();
book b1=new book(101,"thinking java","maneet","pearson",4);
book b2=new book(102,"system sw","girija","mc",4);
book b3=new book(103,"complete ref","herbert","apn",4);
list.add(b1);
list.add(b2);
list.add(b3);
for(book b:list){
System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quality);
}
}}
