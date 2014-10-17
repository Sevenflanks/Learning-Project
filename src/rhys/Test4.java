package rhys;

import java.util.Set;
import java.util.TreeSet;

//java上機考練習題
//排列ABCD

//直接執行
public class Test4 {
	
	public static void main(String[] args) {
		String[] abcd = {"A","B","C","D"};
		
		Set<String> result = new TreeSet<String>();
		for (int i = 0; i < abcd.length; i++) {
			result.add(abcd[i]);
			
			for (int j = 0; j < abcd.length; j++) {
				if(i != j){
					result.add(abcd[i]+abcd[j]);
					
					for (int k = 0; k < abcd.length; k++) {
						if(i != j && i != k && k != j){
							result.add(abcd[i]+abcd[j]+abcd[k]);
							
							for (int l = 0; l < abcd.length; l++) {
								if (i != j && i != k && i != l && j != k && j != l && k != l) {
									result.add(abcd[i]+abcd[j]+abcd[k]+abcd[l]);
								}
							}
						}
					}
				}
			}
		}
		
		for (String string : result) {
			System.out.println(string);
		}
		
	}
}
