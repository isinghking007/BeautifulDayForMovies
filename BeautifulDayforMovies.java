package hackerrank;
import java.io.*;
import java.util.*;
public class BeautifulDayforMovies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the starting date");
		int s=in.nextInt();
		System.out.println("Enter the Ending Date");
		int e=in.nextInt();
		System.out.println("Enter the value of k ");
		int k=in.nextInt();
		int i;
		int count=0;
		for(int l=s;l<=e;l++)
		{
			if((l-rev(l))%k==0)
			{
				count++;
			}
		}
		System.out.println(count);
		
	}
	public static int rev(int n)
	{
		int rev=0;
		while(n!=0)
		{
			rev=rev*10+n%10;
			n=n/10;
		}
		rev+=n;
		return rev;
	}

}
