package ForTest;

import java.io.*;
import java.util.*;

public class Main_07 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i<=N; i++) {
			st = new StringTokenizer(br.readLine()," ");
			sb.append("Case #").append(i).append(": ").append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())).append('\n');
			
		}
//		br.close();
		System.out.println(sb);
	}
}