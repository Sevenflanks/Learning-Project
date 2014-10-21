package rhys;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

//java上機考練習題
//排列ABCD

//直接執行
public class Test4 {

	static int count = 0;
	
	public static void main(String[] args) {
		ArrayList<String> input = new ArrayList<String>();
		input.add("A");
		input.add("B");
		input.add("C");
		input.add("D");
		input.add("E");
		
		Test4.execute3("", input);
	}
	
	public static void execute3(String str, ArrayList<String> input){
		
		for (String string : input) {
			count++;
			System.out.print(count + "\t");
			System.out.println(str + string);
			
			ArrayList<String> output = (ArrayList<String>) input.clone();
			output.remove(string);
			
			if (output.size()>0) {
				execute3(str + string, output);
			}
			
		}

	}

	public static void execute2(){
		ArrayList<String> abcd = new ArrayList<String>();
		
		abcd.add("A");
		abcd.add("B");
		abcd.add("C");
		abcd.add("D");
		
		for (String string1 : abcd) {
			System.out.println(string1);
			
			ArrayList<String> threeWord = (ArrayList<String>) abcd.clone();
			threeWord.remove(string1);
			
			for (String string2 : threeWord) {
				System.out.println(string1+string2);
				
				ArrayList<String> twoWord = (ArrayList<String>) threeWord.clone();
				twoWord.remove(string2);
				
				for (String string3 : twoWord) {
					System.out.println(string1+string2+string3);
					
					ArrayList<String> oneWord = (ArrayList<String>) twoWord.clone();
					oneWord.remove(string3);
					
					for (String string4 : oneWord) {
						System.out.println(string1+string2+string3+string4);	
					}
					
				}
				
			}
			
		}
		
	}
	
	public static void execute1() {
		String[] abcd = { "A", "B", "C", "D" };

		Set<String> result = new TreeSet<String>();
		for (int i = 0; i < abcd.length; i++) {
			result.add(abcd[i]);

			for (int j = 0; j < abcd.length; j++) {
				if (i != j) {
					result.add(abcd[i] + abcd[j]);

					for (int k = 0; k < abcd.length; k++) {
						if (i != j && i != k && k != j) {
							result.add(abcd[i] + abcd[j] + abcd[k]);

							for (int l = 0; l < abcd.length; l++) {
								if (i != j && i != k && i != l && j != k
										&& j != l && k != l) {
									result.add(abcd[i] + abcd[j] + abcd[k]
											+ abcd[l]);
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
