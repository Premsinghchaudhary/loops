package loops;
public class left_triangle_print
{
	public static void main(String[] args) //main method
	{
		int i,j; //declared the variable
		for(i=1;i<=5;i++ ) //using for loop i is used for row
		{
			       for( j=5;j>=i;j--)  //using foe loop j is used for column
			       {
			    	   System.out.print("*"); //print the *
			       }
		              System.out.println();
		}
		

	}

}