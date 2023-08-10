import java.util.Scanner;
public class Concatenate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scan = new Scanner(System.in);
     System.out.println("Enter two strings");
    String str1=scan.next();
    String str2=scan.next(); 
    System.out.println(joinStrings(str1,str2));
    
	}
	public static String joinStrings(String str1,String str2) {
		
		return str1 +" " + str2 ;
	}

}
