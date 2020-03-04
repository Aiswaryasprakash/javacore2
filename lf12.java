

import java.util.*;
class lf12{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("range 1");
int a=sc.nextInt();
System.out.println("range 2");
int b=sc.nextInt();
int j,sum=0,count;
for(int i=a;i<=b;i++)
	{
	count=0;
	for(j=1;j<=i;j++)
	{
	   if(i%j==0)
	   {
	        count++;        
	   }
	}
	if(count==2){
	       System.out.print(i+"  ");   
		sum=sum+i;  
}
    
	}
 System.out.println("sum "+sum);
}}

