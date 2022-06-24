import java.util.Scanner;
public class main {
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	String A =sc.next();
	String B =sc.next();
	System.out.println(A.length() +B.length());
	if(A.compareTo(B)>0)
		System.out.println("yes");
	else
		System.out.println("no");
	
		
	
	
}
}
