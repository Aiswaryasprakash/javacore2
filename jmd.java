class jmd extends Thread{
public void run(){
for(int i=0;i<=5;i++){
try{
Thread.sleep(500);
}
catch(Exception e){System.out.println(e);}
System.out.println(i);
}}
public static void main(String args[]){
jmd t1=new jmd();
jmd t2=new jmd();
jmd t3=new jmd();
t1.start();
try{
t1.join(1500);
}
catch(Exception e){System.out.println(e);}
t2.start();
t3.start();
}}
