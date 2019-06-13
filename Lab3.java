//dfa that accepts the string over {a,b} such that every string accepted must start with w=ba
package toc_lab_dfa;
import java.util.*;
public class Lab3 {
	public static void main(String[] args) {
		int q=0,i=0;
		System.out.println("Enter any string :");
		Scanner sc=new Scanner(System.in);
		String string=sc.nextLine();
		for(i=0;i<string.length();i++)
		{
			char ch=string.charAt(i);
			if (q==0 && ch=='a')
			{
			q=3;
			}
			else if(q==0 && ch=='b')
			{
			q=1;
			}
			else if(q==1 && ch=='a')
			{
			q=2;
			}
			else if(q==1 && ch=='b')
			{
			q=3;		
			}
			else if(q==2 && ch=='a')
			{
			q=2;
			}
			else if(q==2 && ch=='b')
			{
			q=2;
			}
			else if(q==3 && ch=='a')
			{
				q=3;
				}
				else if(q==3 && ch=='b')
				{
				q=3;
				}
				else
				{
				q=4;
				break;
				}
		}
		if(q==2)		
			System.out.println("Accepted.");
		else
			System.out.println("Rejected.");

		}
	}


