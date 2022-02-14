package ArrayTest;

import java.io.*;

public class Main_06 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] arr = new String[N];
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < N; i++) {
			arr[i] = br.readLine();
		}
		 		 
		 for(int i = 0; i < N; i++) {
			 int cnt = 0; //연속횟수
			 int sum = 0; //누적 합			 
			 for(int j = 0; j < arr[i].length(); j++) {
				 if (arr[i].charAt(j) == 'O') {
					 cnt++; 
				 }else {
					 cnt = 0;
				 }
				 sum += cnt;
			 }
			 sb.append(sum).append('\n');
		 }
		 System.out.print(sb);		
	}
}
