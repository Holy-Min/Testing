package ForTest;

import java.io.*;

public class Main_05 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		br.close();	
		
		StringBuilder sb = new StringBuilder();
		for(int i=1; i<=N; i++) {
			sb.append(i + "\n");
		}
		
		System.out.println(sb);
	}
}
