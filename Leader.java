class Leader
{
 public static void main(String args[])
 {
   int arr[]={7,1, 5, 3, 6, 4};
   int size =arr.length;
   System.out.println("leaders in the array are:");
   for(int i=0; i<size; i++)
   {
     int j;
     for(j=i+1; j<size; j++)
     {
       if(arr[i]<=arr[j])
       break;
    }
    if(j==size)
    System.out.println(arr[i] + " ");
}
}
} 