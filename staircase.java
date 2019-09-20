import java.util.*;
public class staircase
{
  public static void main(String[] args)
  {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter n value");
     int n=sc.nextInt();
      int c=0;
     for(;n>0;n--)
     {
       for(int i=n-1;i>0;i--)
        System.out.print(" ");
       for(int j=++c;j>0;j--)
	System.out.print("#");
        System.out.println("");
     }
   }
}
        
	
     
    