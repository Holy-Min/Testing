package WhileTest;

import java.io.*;
import java.util.*;

public class Main_01 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		while(true) { //true로 무한 반복
			st = new StringTokenizer(br.readLine(), " ");
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			if( A == 0 && B == 0) { //입력의 종료는 A == 0 && B ==0 일때
				break;
			}
			sb.append(A+B).append('\n');
		} 
		System.out.println(sb);
	}
}
