//dfa over {a,b} such that every string acceoted must contain a substring "aa" or "bb"
package toc_lab_dfa;
import java.util.Scanner;
public class Lab5 {
public static void main(String[] args) {
	int i=0,q=0;
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
	q=2;
	}
	else if(q==1 && ch=='a')
	{
	q=3;
	}
	else if(q==1 && ch=='b')
	{
	q=2;		
	}
	else if(q==2 && ch=='a')
	{
	q=1;
	}
	else if(q==2 && ch=='b')
	{
	q=3;
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
if(q==3)		
	System.out.println("Accepted.");
else
	System.out.println("Rejected.");

}
}
