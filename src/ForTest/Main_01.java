package ForTest;

import java.io.*;

public class Main_01 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		for(int i = 1; i < 10; i++) {
			System.out.println(a + " * " + i + " = " + (a*i));
		}
	}
	
}
