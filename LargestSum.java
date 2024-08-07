import java.io.*;
import java.util.*;
class LargestSum
{
public static void main(String args[] )
{
int[]a={-2,1,-3,4,-1,2,-5,4};
System.out.println("maximum contiguous sum is"+maxSum(a));
}
static int maxSum(int a[])
{
int size=a.length;
int max=Integer.MIN_VALUE,max_ending=0;
for(int i=0;i<size;i++)
{
max_ending+=a[i];
if(max<max_ending)
max=max_ending;
if(max_ending<0)
max_ending=0;
}
return max;
}  
}