package loops;

public class loop_nested {
	public static void main (String args[]) {
		int i,j; //variable declared 
		for( i=1;i<=5;i++) //using for loop 'row'
		{
			     for( j=5;j>=i;j--) //using for loop 'column'
			     {
			    	   if( j%2==0) //using statement
				   { 
			    		   System.out.print( "0"); 
			    	   }
			    	   else {
			    		   System.out.print( "1");
			    	   }
			     }
		       System.out.println();
		}
		
	}

}