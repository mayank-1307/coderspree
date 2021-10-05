import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int m=n,k,i;
		k=0;
		while(m>0)
		{
		    m=m/10;
		    k++;
		}
		int [] a = new int[k];
		i=0;
		while(n>0)
		{
		    a[i]=n%10;
		    i++;
		    n=n/10;
		}
		for(i=k-1;i>=0;i--)
		System.out.println(a[i]);
	}
}