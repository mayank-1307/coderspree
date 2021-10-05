import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int i,flag;
       int t=sc.nextInt();
       while(t-->0)
       {
           flag=0;
           int n=sc.nextInt();
           for(i=2;i<n;i++)
           {
               if(n%i==0)
               {
                   flag=1;
                   break;
               }
               else
               continue;
           }
           if(flag==1)
           System.out.println("not prime");
           else
           System.out.println("prime");
       }
  
   }
  }