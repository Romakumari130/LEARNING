import java.util.Scanner;

public class SimpleNestedIf {
   public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the age");
	int age =scan.nextInt();
	System.out.println("Enter the weight");
	int weight = scan.nextInt();
	if (age>=18) {
		if (weight>50) {
			System.out.println("You are elgibile for donate blood");
		}
		
	}
	
}
}
