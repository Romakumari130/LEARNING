import java.util.Scanner;
public class SwitichCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number between 1 -7");
		int num = scan.nextInt();
		Week D1 = new Week();
		D1.day(num);

	}

}
