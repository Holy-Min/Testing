package ArrayTest;

import java.io.*;
import java.util.*;

public class Main_07 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr;				
		int C = Integer.parseInt(br.readLine()); // 테스트 케이스 개수
		StringTokenizer st;
		
		for(int i = 0; i < C; i++) {
			st = new StringTokenizer(br.readLine(), " "); // 학생 수 및 성적 입력
			
			int N = Integer.parseInt(st.nextToken()); // 학생 수
			arr = new int[N];
			
			double sum = 0;	// 성적 총합의 변수		
			for(int j = 0; j < N; j++) {
				int grade = Integer.parseInt(st.nextToken()); // 성적 입력
				arr[j] = grade; 
				
				sum += grade; // 성적 총합
			}
			double avg = (sum / N); // 성적 평균
			double cnt = 0; // 성적 평균 넘는 학생 수의 변수
			
			for(int j = 0; j < N; j++) { //평균 넘는 학생 수 구하기
				if(arr[j] > avg) {
					cnt++;
				}
			}		
//			String result = String.format("%.3f%%", (cnt/N)*100);
//			System.out.println(result);
			System.out.printf("%.3f%%\n", (cnt/N)*100);
		}
		
	}
}
