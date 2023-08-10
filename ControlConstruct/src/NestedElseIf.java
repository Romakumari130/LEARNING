import java.util.Scanner;

public class NestedElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the age");
		int age =scan.nextInt();
		if (age>18) {
		    System.out.println("You are elgibile for donate blood");
			}	
		else 
			{
			if (age==18) {	
			System.out.println("You are  elgibile to donate from next year ");
			}
			else{
			    System.out.println("You are not elgible to donate");
			}
	   }
	}		
}

