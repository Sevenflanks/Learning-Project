package rhys;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNext()){
			String input = scan.nextLine();
			String in[] = input.split(" ");
			
			List<List<Integer>> tList = new ArrayList<List<Integer>>();
			for (String str : in) {
				int x = Integer.parseInt(str);
				
				List<Integer> factorList = new ArrayList<Integer>();
				factorList.add(x);
				for (int i = x/2; i >= 1; i--) {
					if(x % i == 0){
						factorList.add(i);
					}
				}
				tList.add(factorList);
			}
			
			Collections.sort(tList, new Comparator<List<Integer>>() {
				@Override
				public int compare(List<Integer> o1, List<Integer> o2) {
					return o1.size() - o2.size();
				}
			});
			
			List<Integer> sampleList = tList.get(0);
			int tempCom = 1; 
			for (int sample : sampleList) {
				boolean[] check = new boolean[tList.size()];
				int i = 0;
				for (List<Integer> list : tList) {
					for (Integer x : list) {
						if(x.equals(sample)){
							tempCom = sample;
							check[i] = true;
							break;
						}
					}
					i++;
				} 
				boolean temp = true;
				for (boolean b : check) {
					temp = temp && b;
				}
				
				if(temp){
					break;
				}
			}
			
			System.out.println(tempCom);
			
		}
		
		
		
	}
}
