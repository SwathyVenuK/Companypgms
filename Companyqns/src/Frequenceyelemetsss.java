import java.util.Scanner;

public class Frequenceyelemetsss {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string");
		String str=s.nextLine();
		int freq[]=new int[str.length()];
		char c[]=str.toCharArray();
		int i;int j;
		for(i=0;i<c.length;i++)
		{
			freq[i]=1;
			for(j=i+1;j<c.length;j++)
			{
				if(c[i]==c[j])
				{
					freq[i]++;
					c[j]='0';
				}
				
			}
		}
		for(i=0;i<freq.length;i++)
		{
			if(c[i]!='0'&& c[i]!=' ')
			{
				System.out.println(c[i]+"-"+freq[i]);
			}
			}
		}

	}


