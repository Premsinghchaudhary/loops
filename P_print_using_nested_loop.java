package loops;

public class P_print_using_nested_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i,j;     //declaration of variabla		
        for( i=1;i<8;i++)  //using for loop
        {
        	for(j=1;j<6;j++) //using for loop
        	{
        	        if( i==1||i==4) //uisng condition statment ' else if'
        	        {
        			
                  	
        	              	if( j==5)  //using condition statement ' if '
                            {
                          	System.out.print(" ");
        		            }
        	              	else {
        	              		System.out.print("*");
        	              	}
        	        }
        	        else if( i==2||i==3)
        	        {
        	        	     if( j==1||j==5) {
        	        	    	 System.out.print("*"); //using for '*' print
        	        	     }
        	        	     else {
        	        	    	 System.out.print(" "); //uisng for space
        	        	     }
        	        }
        	        else
        	        { 
        	                 if( j==1) {
        	                	 System.out.print("*"); //using for print
        	                 }
        	        	   
        	        }
        	}
        	System.out.println(); //using for space
       }
        	              	
        			
  	}
}
