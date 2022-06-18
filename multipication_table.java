package loops;
import java.util.Scanner;

public class multipication_table {

	public static void main (String args []) {
		int x;//declaered the variable 
	Scanner sc = new Scanner(System.in); //scanner 
	
	System.out.print( " enter the number : "); //get the number from user 
	x=sc.nextInt(); 
//using for loop
	
		for( int i=1;i<11;i++) {
			System.out.println( x + " * " +i+" = " +( x*i)); //calcualte the everything in this code and get the result 
		}
	}
}