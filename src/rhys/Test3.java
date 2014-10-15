package rhys;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

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