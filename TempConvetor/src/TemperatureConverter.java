import java.util.Scanner;

public class TemperatureConverter {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the temperature in fahrenheit");
	double fahrenheit = scan.nextDouble();
	TemperatureConverter temperatureConverter = new TemperatureConverter();
	 double celsius =temperatureConverter.convertFahrenheitToCelsius(fahrenheit);
	 System.out.println(celsius);
	
}
public double convertFahrenheitToCelsius(double fahrenheit) {
	
	 return (fahrenheit - 32)* 5/9 ;
}
}
