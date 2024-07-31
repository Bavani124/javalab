class Square
{
  public static int FloorOrSqrt(int x)
  {
   if(x==0 || x==1)
   {
    return x;
   }
   int start=1, end=x, ans=0;
   while(start<=end)
   { 
    int mid=(start + end)/2;
    if(mid*mid==x)
    {
    return(mid);
    }
   if(mid *mid<x)
   {
    start=mid+1;
    ans=mid;
  }
  else
{
 end=mid-1;
}
}
return(ans);
}
public static void main(String args[])
{
  int x=19;
  int result=FloorOrSqrt(x);
 if(result*result==x)
 {
   System.out.println("the square root of"  + x +  "is" + result);
}
else
{
System.out.println("floor value of" + x + "is" + result);
}
}
}

 
 