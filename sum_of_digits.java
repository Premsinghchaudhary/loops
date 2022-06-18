package loops;

import java.util.Scanner; 

public class sum_of_digits 
{
	
	public static void main ( String args[])//main method 
	{
		int n,res,sum=0; //declartion variable and data type
		Scanner sc= new Scanner( System.in); //scanner object 
		System.out.println( " Enter the number : "); //get the input from user
		n=sc.nextInt();	
		do  //using do while loop
		{
			res=n%10;  //lets as explain the line means res=154%10;res=4
			sum=sum+res; //now come in second line sum=0+res 
			n=n/10;      //now last 
		}
		while( n>0);
		System.out.println("The sum of digits is = "+sum);//print the value of sum
		
	}

 }