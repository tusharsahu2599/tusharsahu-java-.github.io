import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter no.");
		int n = sc.nextInt();
		System.out.println( "obtain series");
		for(int i=1;i<=n;i++)
			System.out.println(i);
	}
}
