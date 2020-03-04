import java.util.*;
class ald1{
public static void main(String args[]){
ArrayList<String> aList=new ArrayList<String>(5);
aList.add("learning");
aList.add("java");
System.out.println("array list string="+aList);
int value1=aList.indexOf("java");
System.out.println("array list string="+value1);
System.out.println("at is not present so it will print index as -1");
int value2=aList.indexOf("AT");
System.out.println("index retrived at at="+value2);
}}