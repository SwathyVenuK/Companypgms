package Company;

import java.util.Scanner;

public class Charrev {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		 System.out.println("Enter the string");
		 int i;
		String rev="";
		String a=s.next();
		int l=a.length();
		
		for(i=l-1;i>=0;i--)
		{
			 rev=rev+a.charAt(i);
			
		}
		 System.out.println(rev);

	}

}

