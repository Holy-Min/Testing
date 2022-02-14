package ArrayTest;

import java.io.*;
import java.util.*;

public class Main_01 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int index = 0;
		int[] arr = new int[N];
		while(st.hasMoreTokens()) {
			arr[index] = Integer.parseInt(st.nextToken());
			index++;
		}
		Arrays.sort(arr); //배열을 오름차순으로 정렬
		System.out.println(arr[0] + " " + arr[N-1]);
		
		
		
	}

}
