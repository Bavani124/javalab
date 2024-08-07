class Arrange
{
public static void main(String args[])
{
int a[]={1,2,3,4,5,6,7,8,9,10};
int[] rearrangedArray=EvenOdd(a);
System.out.println("Arranging even number in array before odd Number:");
for(int i=0;i<rearrangedArray.length;i++)
{
int num=rearrangedArray[i];
System.out.println(num+" ");
}
}
static int[] EvenOdd(int a[])
{
int n=a.length;
int[] result=new int[n];
int evenIndex=0;
int oddIndex=n-1;
for(int i=0; i<n;i++)
{
if(a[i]%2==0)
{
result[evenIndex++]=a[i];
}
else
{
result[oddIndex--]=a[i];
}
}
return result;
}
}