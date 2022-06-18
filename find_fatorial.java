package loops;

import java.util.Scanner;

public class find_fatorial {

	public static void main(String[] args) //main method
	{
		int n,fact=1;//varaible declared
		System.out.println(" enter the number");//get the input from user 
		
		Scanner sc= new Scanner(System.in); //scanner
		n=sc.nextInt();
		 while(n>0) //using while loop
		 {
		    fact=fact*n; //calculate the fatorial 
		    n--;  // decsement 
	     }
          System.out.println( " factorial is = "+fact); //print the fatorial value 
	}
         
}