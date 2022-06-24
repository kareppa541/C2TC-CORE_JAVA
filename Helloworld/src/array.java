import java.util.*;
public class array {

	public static void main(String[] args) {
		
    Scanner sc = new Scanner(System.in);
		
		  int i,n,search,flag=1;
		System.out.println("Enter the number of elements");
		n =sc.nextInt();
		int[] a =new int[n];
		
		System.out.println("Enter the elements");
		for(i=1;i<n;i++)
		{
			a[i] =sc.nextInt();
		}
		System.out.println("Enter the element to be searched");
		search =sc.nextInt();
		for(i=1;i<n;i++)
		{
			if(a[i]==search)
			{
	System.out.println("Element  "+search+" found at "+i+" position");
				       flag=1;
				       break;
				       }
		}
		if(flag==0)
		{
			System.out.println("Enter "+search+" not found");
		}
	}
}