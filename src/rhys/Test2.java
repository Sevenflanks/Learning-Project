package rhys;

import java.util.Scanner;

//java上機考練習題
//取多個數值的最大公因數

//使用方式:啟動後輸入資料 以空白間隔開 如下
//10 5 25
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
