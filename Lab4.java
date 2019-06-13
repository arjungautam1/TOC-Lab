//dfa over {a,b} that accepts string ending with w=ab
package toc_lab_dfa;
import java.util.Scanner;
public class Lab4 {
	public static void main(String[] args) 
	{
		int q=0,i=0;
		System.out.println("Enter any String :");
		Scanner sc=new Scanner(System.in);
		String string=sc.nextLine();
		for(i=0;i<string.length();i++)
		{
			char ch=string.charAt(i);
			if(q==0 && ch=='a')
			{
				q=1;
			}
			else if(q==0&&ch=='b')
			{
				q=0;
			}
			else if(q==1&&ch=='a')
			{
				q=1;
			}
			else if(q==1&&ch=='b')
			{
				q=2;
			}
			else if(q==2&&ch=='a')
			{
				q=1;
			}
			else if(q==2&&ch=='b')
			{
				q=0;
			}
			else 
			{
				q=3;
				break;
			}	
		}
		if(q==2)
		{
			System.out.println("String is accepted .");
		}
		else 
		{
			System.out.println("String not accepted.");
		}
	}

}
