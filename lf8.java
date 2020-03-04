import java.util.*;
class lf8{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter input");
int n=sc.nextInt();
int i;
int sum=0;
for(i=1;i<=n;i++)
{
if(i%2!=0)
{
sum=sum+i;
}
}
System.out.println("odd sum:"+sum);
}}