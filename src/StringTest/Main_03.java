package StringTest;

import java.io.*;

public class Main_03 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 int[] arr = new int[26]; //알파벳 수 배열 생성
		 for(int i = 0; i < arr.length; i++) { // 배열 안에 기본값을 -1로 설정
			 arr[i] = -1;
		 }
		 
		 String str = br.readLine(); 
		 
		 for(int i = 0; i < str.length(); i++) {
			 char c = str.charAt(i); //입력된 문자를 알파벳 하나하나 나눠서 나타냄
			 
			 if(arr[c - 'a'] == -1) { // arr 원소 값이 -1일때만 i로 초기화
				 arr[c -'a'] = i;	  	
			 }
		 }
		 for(int result : arr) {
			 System.out.print(result + " ");
		 }
	}
}
