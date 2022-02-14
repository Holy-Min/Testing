package ForTest;

import java.io.*;

public class Main_etc3 {
	public static void main(String[] args) throws IOException {
		
		for(int i = 1; i <= 5; i++) { //5개의 행 생성
			for(int j = 1; j <= i; j++) { //행의 순서만큼 반복
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-----");
		for(int i = 1; i<=5; i++) {
			for(int j = 5; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-----");
		int r = 3; // 행의 갯수 생성
		for(int i = r; i > 0; i--) { // 행의 갯수만큼 반복
			for(int j = r-i; j > 0; j--) { // r-i의 크기만큼 반복, !의 갯수 증가
				System.out.print("!");					
			}
			for(int j = 2*i-1; j > 0; j--) { // 2*i-1만큼 반복, *의 갯수 감소
				System.out.print("*");
			}
			for(int j = r-i; j > 0; j--) {
				System.out.print("!");
			}
			System.out.println();
		}
		System.out.println("-----");
		int a = 1; //* 시작 갯수
		int b = 2; //! 시작 갯수
		for(int i = 1; i <= 5; i++) { // 5개의 줄 생성
			if(i <= 2 ) { //전체 줄의 절반 윗부분까지
				for(int j = b; j > 0; j--) { // b(!)의 크기만큼 반복
					System.out.print("!");
				}
				for(int j = 1; j <= a; j++) { // a(*)의 크기만큼 반복
					System.out.print("*");
				}
				for(int j = b; j > 0; j--) { // b(!)의 크기만큼 반복
					System.out.print("!");
				}
				System.out.println(); // 한줄 출력 후 줄 바꿈
				
				a += 2; // * 갯수 2 증가
				b--;// ! 갯수 1 감소
			}else{
				for(int j = 1; j <= b; j++) { // b(!)의 크기만큼 반복
					System.out.print("!");
				}
				for(int j = a; j > 0; j--) { // a(*)의 크기만큼 반복
					System.out.print("*");
				}
				for(int j = 1; j <= b; j++) { // b(!)의 크기만큼 반복
					System.out.print("!");
				}
				System.out.println(); // 한줄 출력 후 줄 바꿈
				
				a -= 2; // * 갯수 2 감소
				b++; // ! 갯수 1 증가
			}
		}
		System.out.println("-----");
//		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//		System.out.print("원하는 행 입력: ");
//		int row = Integer.parseInt(reader.readLine());
//
//		for (int i = 0; i < row; i++) {
//		    for (int j = 1; j<row-i; j++) {
//		    	System.out.print("!");
//		    }
//		    for (int j = 0; j<i*2+1; j++) {
//		    	System.out.print("*");
//		    }
//		    for (int j = 1; j<row-i; j++) {
//		    	System.out.print("!");
//		    }
//		    System.out.println();
//		}
//		System.out.println("-----");
//		BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
//		System.out.print("원하는 행 입력: ");
//		int row1 = Integer.parseInt(reader1.readLine());
//
//		for(int i = row1; i>0; i--) {
//		    for(int j = row1-i; j > 0; j--) {
//		    	System.out.print("!");
//		    }
//		    for(int j = i*2-1; j > 0; j--) {
//		    	System.out.print("*");
//		    }
//		    for(int j = row1-i; j > 0; j--) {
//		    	System.out.print("!");
//		    }
//		    System.out.println();
//		}
		int r1 = 3; // 행 3개 생성
		for(int i = 0; i < r1; i++) { // r1의 크기만큼 반복
			for(int j = 1; j < r1-i; j++) { // !의 갯수는 1개씩 감소
				System.out.print("!");
			}
			for(int j = 0; j < 2*i+1; j++) { // *의 갯수는 홀수(2*i+1)만큼 증가
				System.out.print("*");
			}
			for(int j = 1; j < r1-i; j++) {
				System.out.print("!");
			}
			System.out.println();
		}
		
	}			
}
