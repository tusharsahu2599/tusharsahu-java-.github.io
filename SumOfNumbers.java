import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("How much no you want to add");
        int n = sc.nextInt();
        int array[]=new int[10];
        System.out.println("Enter the no. ");
        for(int i=0; i<n; i++)  
        {  
            array[i]=sc.nextInt();  
        }  
        int sum=0;
	    for(int i=0;i<array.length;++i){
		sum+=array[i];
	    }
	    System.out.println("Sum of All no= "+sum);
	
    }
    
} 
 
