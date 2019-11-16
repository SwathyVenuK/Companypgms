import java.util.Scanner;

public class Freaquencyofanelement {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string");
		String s1=s.nextLine();
		System.out.println("enter the element");
		char c=s.next().charAt(0);
		char arr[]=s1.toCharArray();
		int i;int count=0;
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]==c)
			{
				count++;
			}
			
		}
		System.out.printf("Frequency of %s is %d",c,count);
	}

}
