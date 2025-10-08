/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
			Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=1;i<=t;i++)
		{
		    int n=sc.nextInt();
		    int x=sc.nextInt();
		    int p=sc.nextInt();
		    int marks=x*3;
		    int ic=n-x;
		    int re=marks-ic;
		    if(re>=p)
		    {
		        System.out.println("PASS");
		    }
		    else
		    {
		        System.out.println("FAIL");
		    }
		    
		}
	}
}
