import java.util.Scanner;
class QEque
{
public static void main(String[] args)
{
Scanner scanner=new Scanner(System.in);
System.out.println("enter cofficient a:");
double a=scanner.nextDouble();
System.out.println("enter cofficent of b:");
double b=scanner.nextDouble();
double D=b*b;
System.out.println("the discriminate(0)is :"+D);
if(D>0)
{
System.out.println("the equation has two real and disct roots");
double root1=0;
double root2=b/a;
System.out.println(" root 1:"+root1);
System.out.println("root 2:"+root2);
}
else if(D==0)
{
System.out.println("equation has complex roots which is not possible for this specific equation");
}
scanner.close();
}
}