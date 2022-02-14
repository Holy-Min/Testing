package WhileTest;

import java.io.*;

public class Main_03 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int cnt = 0;
		int cycle = N;
		
//		do {
//			N = ((N % 10) * 10) + (((N/10)+(N%10)) % 10);
//			cnt++;
//		} while(cycle != N);
		while(true) {
			N = ((N % 10) * 10) + (((N/10)+(N%10)) % 10);
		    cnt++;
		    if(cycle ==N)
		    	break;
		}		
		System.out.println(cnt);		
	}
}
