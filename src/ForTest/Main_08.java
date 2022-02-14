package ForTest;

import java.io.*;
import java.util.*;

public class Main_08 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i<=N; i++) {
			st = new StringTokenizer(br.readLine()," ");
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			sb.append("Case #").append(i).append(": ").append(A).append(" + ").append(B).append(" = ").append(A + B).append('\n');
			
		}
		br.close();
		System.out.println(sb);
	}
}