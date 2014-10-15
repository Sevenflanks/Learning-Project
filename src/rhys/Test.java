package rhys;

//java上機考練習題?
//AB兩人相距100km A以6km/hr速度向右 B以4km/hr速度向左 A帶一隻狗C以10km/hr速度向右
//狗C在遇到B後會往A跑，然後再往B跑 如此循環
//問:當AB兩人相遇時 狗C跑了多長距離

//使用方式:直接執行
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
