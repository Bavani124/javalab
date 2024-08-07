import java.util.Scanner;
public class Magic
{
 public static boolean isMagic(int n)
{
 int sum=0;
 while(n>0 || sum>9)
{
if(n==0)
{
n=sum;
sum=0;
}
sum=sum+n%10;
n/=10;
}
return(sum==1);
}
public static void  main(String args[])
{
 Scanner sc=new Scanner(System.in);
 System.out.println("enter a no");
int n=sc.nextInt();
if(isMagic(n))
System.out.println("magic no");
else
System.out.println("not a magic no");
sc.close();
}
}