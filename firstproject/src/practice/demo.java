package practice;
import java.util.Scanner;
public class demo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first name of student");
		String a = scan.next();
		System.out.println("First name =  " + a);
		System.out.println("Enter the last name of student");
		String g = scan.next();
		System.out.println(" Last name =  " + g);
		System.out.println("Enter the branch of Student");
		scan.nextLine();
		String b = scan.nextLine();
		System.out.println("Branch = " + b);
		System.out.println("Enter the age");
		int c = scan.nextInt();
		System.out.println("Age = " + c);
		System.out.println("Enter the grade of student");
		float e = scan.nextFloat();
		System.out.println("Grade = "+ e);
		System.out.println("Is student Married? True or False");
		boolean f = scan.nextBoolean();
		System.out.println("married? = "+ f);
		
		
;
		
		
	
		
	}

}
