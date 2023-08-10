import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the marks");
		int marks = scan.nextInt();
		System.out.println("Welcome To Kodnest");
		checkEligibility(marks);
	}
	public static void checkEligibility(int marks) {
		if(marks>=80) {
			System.out.println("Welcome To Tech Club");
		}
	}

}
