package rhys;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		while(scan.hasNext()){
			String input = scan.nextLine();
			String[] inputList = input.split(" ");
			
			int[] in = new int[inputList.length];
			for (int i = 0; i < in.length; i++) {
				in[i] = Integer.parseInt(inputList[i]);
			}
			
			int lastCd = in[0];
		
			for (int i = 0; i < in.length; i++) {
				lastCd = Test2.gcd(lastCd, in[i]);
			}
			
			System.out.println(lastCd);
		}
	}
	
	public static int gcd(int m, int n){
		return n == 0? m: gcd(n, m % n);
	}
}
