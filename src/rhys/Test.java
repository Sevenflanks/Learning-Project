package rhys;

public class Test {

	public static void main(String[] args) {
		double as = 6, bs = 4, cs = 10;
		double td = 100;
		double x = 0;
		double result = 0;
		while (true) {
			
			x = Test.dis(td, bs, cs);
			td = 100 - (as * x + (100 - cs * x));
			System.out.println(cs * x);
			result += cs * x;
			
			x = Test.dis(td, as, cs);
			td = 100 - (bs * x + (100 - cs * x));
			System.out.println(cs * x);
			result += cs * x;
			
			if(cs * x == 0.0){
				break;
			}
		}
		System.out.println(result);
	}
	
	public static double dis(double d, double left, double right){
		return d/(left+right);
	}
}
