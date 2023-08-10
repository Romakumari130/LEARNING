import java.util.Scanner;

public class IfElseLadder {
    public static void main(String[] args) {
	  Scanner scan = new Scanner(System.in);
	  System.out.println("Enter the score");
	  int score = scan.nextInt();
	  checkGrade g1= new checkGrade();
	  g1.grade(score);
	}
}
