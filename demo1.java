interface libraryuser
{
//int age=17;
//String booktype="adults";

void regacc(int age);
void reqbook(String booktype);
}
class kidusers implements libraryuser
{

public void regacc(int age){
if(age<12)
{System.out.println("you have successfully registered under a kids account");
}
else
{System.out.println("sorry,age must be less than 12 to register as a kid ");}
}
public void reqbook(String booktype)
{
if(booktype.equals("kids"))
{
System.out.println("book issued successfully,please return the book within 10 days");
}
else
{
System.out.println("oops,you are allowed take only kids books");
}
}}
class adultusers implements libraryuser
{

public void regacc(int age){
if(age<12)
{System.out.println("you have successfully registered under a adult account");
}
else
{System.out.println("sorry,age must be greater than 12 to register as a adult ");}
}



public void reqbook(String booktype)
{
if(booktype.equals("adults"))
{
System.out.println("book issued successfully,please return the book within 7 days");
}
else
{
System.out.println("oops,you are allowed take only adult fiction books");
}
}}
class demo1
{
public static void main(String[] args){

libraryuser a=new kidusers();
a.regacc(10);
a.reqbook("kids");

}}


