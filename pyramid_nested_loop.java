package loops;

public class pyramid_nested_loop {     // reverse pyramid

	public static void main(String[] args) {
    int i,j,k;//declartion variable
    for( i=5;i>=1;i--) //using for loop i is use for row
    {
    	     for(k=4;k>=i;k--)//k for space 
    	     {
    	    	 System.out.print(" "); 
    	     }
    	     for( j=1;j<=2*i-1;j++) { //j is use fro colum
    	    	 System.out.print("*"); //print star*
      	     }
                 System.out.println(); 
    }
    
    

	}

}