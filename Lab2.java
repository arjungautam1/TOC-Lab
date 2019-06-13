//accepting string   ending  with 3 consecutive 0's
package toc_lab_dfa;

import java.util.*;
public class Lab2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String");
		String string=sc.nextLine();
		int q=0;
		for(int i=0;i<string.length();i++) {
			char ch=string.charAt(i);
			if (q==0 && ch=='0')
			{
			q=1;
			}
			else if(q==0 && ch=='1')
			{
			q=0;
			}
			else if(q==1 && ch=='0')
			{
			q=2;
			}
			else if(q==1 && ch=='1')
			{
			q=0;			}
			else if(q==2 && ch=='1')
			{
			q=0;
			}
			else if(q==2 && ch=='0')
			{
			q=3;
			}
			else if(q==3 && ch=='1')
			{
				q=0;
				}
				else if(q==3 && ch=='0')
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
			
	