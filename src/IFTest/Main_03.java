package IFTest;

import java.io.*;

public class Main_03 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int Y = Integer.parseInt(br.readLine());
		
		System.out.println((Y%4==0)? ((Y%400==0)?"1":(Y%100==0)?"0":"1"):"0");
//		if(A%4 == 0 && A%100 != 0 || A%400 == 0 ) {
//			System.out.println("1");
//		}else {
//			System.out.println("0");
//		}
	}
}
