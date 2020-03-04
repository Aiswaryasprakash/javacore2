public static void main(String[] args) {
HashMap<Integer, String>hm=new HashMap<Integer, String>();
hm.put(2,"hi");
hm.put(8, "hello");
hm.put(15, "yoo");
hm.put(12, "world");
hm.put(45, "ya");
getvalues(hm);
}
public static void getvalues(HashMap<Integer, String> hm) {
int count=0;
HashMap<Integer, String>hm1=new HashMap<Integer, String>();
Iterator<Integer>itr=hm.keySet().iterator()
;
while(itr.hasNext())
{
int n=itr.next();
if(n%4!=0)
{
count++;
}
}
System.out.println(count);
}
}