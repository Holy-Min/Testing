package ArrayTest;

import java.io.*;

public class Main_02 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[9];
		
		for(int i  = 0; i < 9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		int max = 0;
		int index = 0;
		int cnt = 0;
		
		for(int value : arr) {
			cnt++;
			if(value > max) {
				max = value;
				index = cnt;
			}
		}		
		System.out.println(max);
		System.out.println(index);						
	}
}
