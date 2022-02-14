package IOTest;

import java.io.*;
import java.util.*;

public class Main_08 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str," ");
		double A = Integer.parseInt(st.nextToken());
		double B = Integer.parseInt(st.nextToken());
		
		System.out.println(A/B);
	}
}
