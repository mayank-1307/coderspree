import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    int n=sc.nextInt();
	    int a=0,b=1,c=1;
	    n=n-2;
	    System.out.println(a);
	    System.out.println(b);
	    while(n-->0)
	    {
	        System.out.println(c);
	        a=b;
	        b=c;
	        c=a+b;
	    }
	}
}