import java.util.*;
class lf9{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter input");
int a=sc.nextInt();
int n=a;
int r,rem=0;
while(n!=0)
{
r=n%10;
rem=rem*10+r;
n=n/10;
}
System.out.println("Reverse "+rem);
}}