package rhys;

//java上機考練習題
//列出n,m之間所有的質數

//直接執行
public class Test5 {

	public static void main(String[] args) {
		Test5.execute(1, 100000);
	}
	
	public static void execute(long n, long m){
		
		for (long i = n; i <= m; i++) {
			
			boolean hasBreak = false;
			long jMax = i / 2;
			for (long j = 2; j <= jMax; j++) {
				if( i % j == 0){
					hasBreak = true;
					break;
				}
			}
			
			if (!hasBreak) {
				System.out.println(i);
			}
			
		}
		
	}
	
}
