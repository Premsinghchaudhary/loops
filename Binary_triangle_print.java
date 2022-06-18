package loops;
public class Binary_triangle_print 
{
	public static void main ( String args []){
		int i,j;//declared the variable and datatype
		for( i=1;i<=5;i++) //using for loop i is for row
		{
			  for(j=1;j<=i;j++) //using for loop j is for column
			  {
				  if( j%2==0)              //using condition statement
				  {
					  System.out.print("0"); //print 0''
				  }
				  else 
				  {
					System.out.print("1");  //print '1'
				  }
			  }
		     System.out.println(); 
		}
		
	}

}