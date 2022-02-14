package FxTest;

import java.io.*;

public class Main_03 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		System.out.println(count(N));
	}
	public static int count(int N) {
		int cnt = 0; //한수의 갯수
		
		if(N < 100) { // 100보다 작은 수는 전부 한수
			return N;
		}else {
			cnt = 99; // 100이전까지는 전부 한수이기 때문에 99부터 갯수 카운트
			
			for(int i = 100; i <= N; i++) {
				int A = i / 100; // 백의 자리수
				int B = (i / 10) % 10;  //십의 자리수
				int C = i % 10; //일의 자리수
				
				if((A-B) == (B-C)) { // 등차수열 조건
					cnt++;
				}
			}
		}
		return cnt;
	}
}
