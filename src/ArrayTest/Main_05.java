package ArrayTest;

import java.io.*;
import java.util.*;

public class Main_05 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		double arr[] = new double[Integer.parseInt(br.readLine())]; //소수점 오차까지 고려해서 double로 선언
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Double.parseDouble(st.nextToken()); //점수값 입력
		}
		 double sum = 0; // 합 변수 선언
		 Arrays.sort(arr); // 배열 오름차순으로 정렬
		 
		 for(int i = 0; i < arr.length; i++) {
			 sum += (arr[i] / arr[arr.length-1]) * 100; //입력된 점수값을 오름차순으로 정렬한 배열에서 구한 최대값의 점수값으로 나누고 * 100
		 }
		 System.out.println(sum / arr.length);
	}
}
