import java.util.Scanner;
public class Permutation  {
 
      static void printPermutn(String str, String ans)
    {
              if (str.length() == 0) {
            System.out.print(ans + "  ");
            return;
        }
 
        for (int i = 0; i < str.length(); i++) 
          {
                   char ch = str.charAt(i);
 
                     String ros = str.substring(0, i) +
                        str.substring(i + 1);
 
                     printPermutn(ros, ans + ch);
        }
    }
 
      public static void main(String[] args)
    {
 System.out.println("enter a string");
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
printPermutn(str," ");
sc.close();
}
}