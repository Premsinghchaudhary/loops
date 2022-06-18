package loops;

public class Nested_patten {

	public static void main(String[] args) { //create main method 
		int i,j; // declared the variable
		for(i=1;i<=5;i++ ) //using for loop
		{
			for(j=1;j<=i;j++ )  //using for loop
			{
				System.out.print("*" ); //print *
			}
			   System.out.println();    
		}

	}

}