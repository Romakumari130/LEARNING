package objectss;
 
public class FanApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fan f1 = new Fan();
		f1.no_Of_Wings = 3;
		f1.color = "black";
		f1.cost=300;
		f1.brand="crompton";
		System.out.println(f1.no_Of_Wings + " " + f1.color + " " + f1.cost + " " + f1.brand);
		f1.fanCanRotate();
		f1.itCanBlow_Air();
		System.out.println("+++++++++++++++++++++++");
		Fan f2 = new Fan();
		f2.no_Of_Wings = 2;
		f2.color = "Brown";
		f2.cost=400;
		f2.brand="usha";
		System.out.println(f2.no_Of_Wings + " " + f2.color + " " + f2.cost + " " + f2.brand);
		f2.fanCanRotate();
		f2.itCanBlow_Air();
		System.out.println("+++++++++++++++++++++++");
		Fan f3 = new Fan();
		f3.no_Of_Wings = 4;
		f3.color = "Blue";
		f3.cost=600;
		f3.brand="crompton";
		System.out.println(f3.no_Of_Wings + " " + f3.color + " " + f3.cost + " " + f3.brand);
		f3.fanCanRotate();
		f3.itCanBlow_Air();

	}

}
