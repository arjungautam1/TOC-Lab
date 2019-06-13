//dfa that accepts string such that accepted string must have length of a  |w|a=3(mod 4)
package toc_lab_dfa;

import java.util.Scanner;

public class Lab7 {
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
			q=1;
			}
			else if(q==0 && ch=='b')
			{
			q=0;
			}
			else if(q==1 && ch=='a')
			{
			q=2;
			}
			else if(q==1 && ch=='b')
			{
			q=1;		
			}
			else if(q==2 && ch=='a')
			{
			q=3;
			}
			else if(q==2 && ch=='b')
			{
			q=2;
			}
			else if(q==3 && ch=='a')
			{
				q=0;
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
		if(q==3)		
			System.out.println("Accepted.");
		else
			System.out.println("Rejected.");

		}
}
