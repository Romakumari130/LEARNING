package practice;

import java.util.Scanner;

public class MethodConceptType3Type4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter the name and year of birth");
			String name = scan.next();
			// TODO Auto-generated method stub
			
			int yob=scan.nextInt();
			greet(name);
			int res =calculateAge(yob);
			System.out.println("Yor are 3 years old");
	}

	
		public static void greet(String name)
		{
			System.out.println("hello " +name+ ".......");
		}
		public static int calculateAge(int yob) 
			{
		        
				//System.out.println(year);
				return 2023 - yob;
				
			}

	}


