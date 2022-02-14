package IFTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_07 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");		
		
		int F = Integer.parseInt(st.nextToken());
		int S = Integer.parseInt(st.nextToken());
		int T = Integer.parseInt(st.nextToken());
		
		if( F == S && F == T) {
			System.out.println(10000 + (F*1000));
		}else if(F == S || F == T) {
			System.out.println(1000 + (F*100));
		}else if(S == T) {
			System.out.println(1000 + (S*100));
		}else {
			System.out.println(Math.max(Math.max(F, S), T)*100);
		}
	}
}
