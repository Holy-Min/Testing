package WhileTest;

import java.io.*;
import java.util.*;

public class Main_02 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		String str;
		while((str=br.readLine()) != null) { //입력의 종료는 더이상 읽을 수 있는 파일(EOF:End Of File)이 없을 때
			st = new StringTokenizer(str, " ");
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			sb.append(A+B).append('\n');
		} 
		System.out.print(sb);
	}
}
