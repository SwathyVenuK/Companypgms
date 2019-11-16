import java.util.Scanner;

public class Deletethevowels {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		String b=s.next();
		int l=b.length();
		int i;
		char a;
		for(i=0;i<l;i++)
		{
			a=b.charAt(i);
			
			 if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'||a=='A'||a=='E'||a=='I'||a=='O'||a=='U')
			{
				System.out.print("");
			}
			 else 
			 {
				 System.out.printf("%s",a);
			 }
		}
		
	}

}
