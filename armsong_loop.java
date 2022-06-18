package loops;

import java.util.Scanner;
public class armsong_loop {

	public static void main(String [] args) //main method
	{
 		
        int num,sum=0;    //declartion of variable and datatype is int 
		Scanner sc = new Scanner( System.in );
 System.out.println(" Enter the number:"); //get the number from user 
 num=sc.nextInt();//pass the num value in scanner 
 int res=num; 
 int r; //declared the variable is r and datatype is int
 do //using do while loop
    {
	 r=num%10;
	 sum=sum+( r*r*r);
	 num=num/10;
    }
 while(num>0); 
 if( sum==res)  //using condition statement 
 {
	 System.out.println(" Its is armsong ");
	 
 }
 else {
	 System.out.println(" Its is not armsong ");
 }
	
	
	}
}