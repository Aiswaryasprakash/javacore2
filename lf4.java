import java.util.*;
class lf4{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
int big=(a>b && a>c)?a:((b>c)?b:c);
int sec=(a!=big && a>c ||a>b)?a:((b!=big && b>a || b>c)?b:c);
System.out.println("big "+big);
System.out.println("sec "+sec);
}}

