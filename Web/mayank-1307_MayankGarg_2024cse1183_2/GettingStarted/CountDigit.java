import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int k=0;
		while(n>0)
		{
		    n=n/10;
		    k++;
		}
		System.out.println(k);
	}
}