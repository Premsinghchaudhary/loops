package loops;
import java.util.*;

public class while_loop {
	
	public static void main ( String agrs [] ){
		int  max,min; // declartion of the variable
		Scanner sc=new Scanner ( System.in);  //scanner 
		
		// Taking input from of the user
		//for maximum value
	    	System.out.println( " enter the maximum value : ");
	    	max =sc.nextInt();
	    	
	    //for minimum value	
	    	System.out.println( " enter the minimum value : ");
	    	min =sc.nextInt();	    	
	    	int i=min;
	    	while(i<=max)
	    	{
	    		System.out.println( i); //print the max value 
	    	i++;
	    	}
	    	
	}

}
