package loops;

public class square_print 
{
	public static void main(String[] args) 
	{
		int i,j; //vaariable declared 
		for( i=1;i<5;i++) //using for loop 'row'
       		{
                  for (j=1;j<5;j++)//using for loop 'column'
                  {
                    System.out.print ( "*"); //print the *
                  }
                  System.out.println ();
            }	 
}
}