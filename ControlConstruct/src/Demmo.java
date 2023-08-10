import java.util.Scanner;

public class Demmo {
  public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the age");
	int age = scan.nextInt();
	DemoApp d1 = new DemoApp();
	d1.method1(age);
	
	}
}
