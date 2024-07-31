class Bin
{
 public static void main(String args[])
 {
  int a[], n=25, i=0, count=0;
  a=new int[10];
  while(n>0)
{
 a[i]=n%2;
n/=2;
if(a[i]==1)
count=count+1;
i=i+1;
}
System.out.println("count:" +count);
}
}