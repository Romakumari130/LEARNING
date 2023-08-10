package practice;

public class methodtype {
			public static void main(String[] args) {
				// parameter,No return value
				int x =103;
				int y=300;
				int res= Add(x,y);//Method call
				System.out.println(res);
			}
			
			public static int Add(int a,int b)
			{
				int c =a+b;
				//System.out.println(c);;
				return c;
			}
}

