import java.util.Scanner;

public class Evenodd {

	public static void main(String[] args) {
     
    int number;
    System.out.println("pls Enter an integer Number");
    Scanner scan =new Scanner(System.in);
    number =scan.nextInt();
    scan.close();
    if((number & 1)==1)
    	System.out.println(number+" is an odd Number");
    else
    	System.out.println(number+" is an even Number");
    
	}

}
