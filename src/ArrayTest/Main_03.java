package ArrayTest;

import java.io.*;

public class Main_03 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[10];
		
		int N = (Integer.parseInt(br.readLine()))*(Integer.parseInt(br.readLine()))*(Integer.parseInt(br.readLine()));
		
		while(N !=0) {
			arr[N%10]++; // 나머지가 일의 자리수를 나타내고 그것을 배열에 담음
			N /= 10;	// N 이 0이 될 때까지 계속 10으로 나눔		
		}
		for(int result : arr) {
			System.out.println(result);
			
		}		
	}
}
