package practice;
import java.util.Scanner;

public class MethodConceptType3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the name");
		String name = scan.next();
		// TODO Auto-generated method stub
		greet(name);

	}
	public static void greet(String name)
	{
		System.out.println("hello" +name+ "How are you");
	}

}
