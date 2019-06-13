//dfa for language over {0,1} which accepts all strings with even number of 0's
package  toc_lab_dfa;
import java.util.*;
public class Lab1{
public static void main(String[] args) {
	int q=0;
	int i=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String :");
	String string =sc.nextLine();
	for(i=0;i<string.length();i++)
	{
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
		q=0;
		}
		else if(q==1 && ch=='1')
		{
		q=1;		
		}
		else 
		{
			q=2;
			break;
		}
	
	}
	if(q==0)
		System.out.println("Accepted.");
	else 
		System.out.println("not Accepted .");
}
}