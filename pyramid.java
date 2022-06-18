package loops;

public class pyramid {  

	public static void main(String[] args) {
    int i,j,k;//declartion varaiable
    for( i=1;i<=5;i++)  //using for loop for row
    {
    	     for(k=4;k>=i;k--)//k for space 
    	     {
    	    	 System.out.print(" ");
    	     }
    	     for( j=1;j<=2*i-1;j++) { //using for loop for colum
    	    	 System.out.print("*"); //print * 
      	     }
                 System.out.println();
    }
    
    

	}

}