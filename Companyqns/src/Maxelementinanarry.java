import java.util.Scanner;

public class Maxelementinanarry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s=new Scanner(System.in);
	      int m=0;
	      System.out.printf("enter the size of the array\n");
	      int n=s.nextInt();
	      System.out.printf("\nenter the elements in an array\n");
	      int[] a=new int[n];
	      for(int i=0;i<n;i++)
	      {
	           a[i]=s.nextInt();
	        
	      }
	      for(int i=0;i<n;i++)
	      {
	        if(a[i]>=m)
	        {
	          m=a[i];
	        }
	      }
	      System.out.printf("%d is the maximum element in the array \n",m);
	    }
	
	}


