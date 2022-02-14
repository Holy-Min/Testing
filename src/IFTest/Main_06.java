package IFTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_06 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());		
		
		int H = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(br.readLine());
		
		H += C/60;
		M += C%60;
		
		if(M > 59) {
			H += 1;
			M -= 60;
		}	
		if(H > 23) {
				H -= 24;
		}
		System.out.println(H + " " + M);
	}
}
