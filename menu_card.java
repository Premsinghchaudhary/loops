package loops;
import java.util.Scanner;
public class menu_card 
{

	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		
		int total = 0;
		char ans;
	
		System.out.println("\t\t WELCOME TO 7 STAR HOTEL");
		
		do {
			System.out.println("Menu :- \n 1: Starter's\n 2: Main  \n 3: Dessert");
			System.out.print("Select your choise :");
			int choise = sc.nextInt();
			
			switch(choise) {
			case 1 : 
				   System.out.println("Starter's  :- \n 1: matar panner = Rs.200 \n 2: chomin = Rs.150 \n 3: Veg roll = Rs.300");
				   System.out.print("select your Item :");
				     int ch1 = sc.nextInt();
				     switch(ch1) {
				     case 1: System.out.println("matar panner =");
				             total+=200;
				           
				             
				             System.out.println("Total Amount = "+"Rs"+" "+total);
				     break;
				     case 2:
				    	 System.out.println("chomin = ");
			             total+=150;
			             System.out.println("Total Amount = "+"Rs"+" "+total);
				    	 break;
				     case 3:
				    	 System.out.println("veg roll");
			             total+=300;
			             System.out.println("Total Amount = "+"Rs"+" "+total);
				    	 break;
				    	 default:
				    		 System.out.println(" Please Enter which is given in the menu card ");
				     }
				     break;
			case 2 :
				System.out.println("Main  :- \n1: momos = Rs 100 \n2: panner tikka = Rs 150 \n3:  Pizza = Rs 200 ");
				System.out.print("select the Iteam :-");
				int main = sc.nextInt();
				switch(main) {
			     case 1: System.out.println(" momos ");
			             total+=100;
			             System.out.println("Total Amount = "+"Rs"+" "+total);
			     break;
			     case 2:
			    	 System.out.println("panner tikka");
		             total+=150;
		             System.out.println("Total Amount = "+"Rs"+" "+total);
			    	 break;
			     case 3:
			    	 System.out.println("Pizza");
		             total+=200;
		             System.out.println("Total Amount = "+"Rs"+" "+total);
			    	 break;
			    	 default:
			    		 System.out.println("  Please Enter which is given in the menu card ");
			     }
				break;
			case 3 : 
				System.out.println("Dessert's are :- \n1: allu parathe= Rs 50 \n2: ras malai = Rs 50 \n3: Chocolate= Rs 150 ");
				System.out.print("select the Iteam :-");
				int dessert = sc.nextInt();
				switch(dessert){
			     case 1: System.out.println("allu parathe");
			             total+=50;
			             System.out.println("Total Amount = "+"Rs"+" "+total);
			     break;
			     case 2:
			    	 System.out.println("ras malai");
		             total+=50;
		             System.out.println("Total Amount = "+"Rs"+" "+total);
			    	 break;
			     case 3:
			    	 System.out.println("Chocolate ");
		             total+=150;
		             System.out.println("Total Amount = "+"Rs"+" "+total);
			    	 break;
			    	 default:
			    		 System.out.println("  Please Enter which is given in the menu card ");
			     }
			}
			
			System.out.println("Do you want to Add more Items :  Y/N");
			 ans = sc.next().charAt(0); 
		}
		while(ans == 'y'|| ans =='Y');
		
		System.out.println(" Thanks for visit  ");
	}
}