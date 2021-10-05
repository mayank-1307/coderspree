import java.util.*;

public class Main {

    public static void main(String[] args) {
        int i,j;
       for(i=0;i<5;i++)
       System.out.print("*");
       System.out.println();
       
       for(i=1;i<4;i++)
       {
           for(j=0;j<5;j++)
           {
               if(i+j==4)
               System.out.print("*");
               else 
               System.out.print(" ");
           }
           System.out.println();
       }
       for(i=0;i<5;i++)
       System.out.print("*");
       System.out.println();
    }
}