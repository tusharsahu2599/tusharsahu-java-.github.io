import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First No.");
	    	int a=sc.nextInt();
		    System.out.println("Enter Second No.");
		    int b=sc.nextInt();
		    System.out.println("Enter Third No.");
		    int c=sc.nextInt();
		if(a>b && a>c)
			System.out.println("First no is greater = "+a);
		
		else if(b>a && b>c)
			System.out.println("Second no is greater = " +b);
		
		else
			System.out.println("Third no is greater = " +c);
	}
}
