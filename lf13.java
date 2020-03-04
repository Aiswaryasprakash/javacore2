import java.util.*;
class lf13{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("no of elements");
int n=sc.nextInt();
int a[]=new int[n];
int i;
int flag=0;
System.out.println("enter elements");
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
System.out.println("enter the no to be searched");
int inp=sc.nextInt();
for(i=0;i<n;i++)
{
if(a[i]==inp){
flag=1;

break;
}
else{
flag=0;
}
}
if(flag==1)
{
System.out.println("found"+a[i]);
}
else{System.out.println("not found");}
}}




