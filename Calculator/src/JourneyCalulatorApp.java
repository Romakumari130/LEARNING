import java.util.Scanner;
public class JourneyCalulatorApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the speed of the vechile in km/h and time in hours");
		double speed =scan.nextDouble();
		double time = scan.nextDouble();
		JourneyCalculator journeyCalculator = new JourneyCalculator();
		double distance =journeyCalculator.calculateDistance(speed, time);
		System.out.println(distance);

	}

}
