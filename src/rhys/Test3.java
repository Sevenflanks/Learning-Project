package rhys;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

//java上機考練習題
//統計資料
//資料範例:
//種類 數量 單價
//CPU 2 100
//RAN 2 50
//RAM 4 200
//DISK 5 100
//將所有同意種類數量合計，並印出每種類平均單價

//使用方式:啟動後輸入資料 每行為一筆資料 每筆資料的值以空白間隔開 如下
//CPU 2 100
public class Test3 {
	public String idName;
	public int quan;
	public int sum;

	public static void main(String[] args) {

		Map<String, Test3> beans = new TreeMap<String, Test3>();
		
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			
			String[] inputStr = scan.nextLine().split(" ");
			
			boolean hasGet = false;
			for (Entry<String, Test3> e : beans.entrySet()) {
				if(e.getKey().equals(inputStr[0])){
					e.getValue().quan += Integer.parseInt(inputStr[1]);
					e.getValue().sum += Integer.parseInt(inputStr[1]) * Integer.parseInt(inputStr[2]);
					
					hasGet = true;
				}
			}
			
			if(!hasGet){
				Test3 bean = new Test3();
				bean.idName = inputStr[0];
				bean.quan = Integer.parseInt(inputStr[1]);
				bean.sum = Integer.parseInt(inputStr[1]) * Integer.parseInt(inputStr[2]);
				
				beans.put(inputStr[0], bean);
			}
			
			System.out.println("----result----");
			System.out.printf("%-5s%4s%8s%6s%n", "ID", "Q", "SUM", "AVG");
			for (Entry<String, Test3> e : beans.entrySet()) {
				System.out.printf("%-5s%4s%8s%6s%n",e.getValue().idName, e.getValue().quan, e.getValue().sum, e.getValue().sum/e.getValue().quan);
			}
			System.out.println("--------------");
		}

	}
}