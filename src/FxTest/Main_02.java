package FxTest;

public class Main_02 {
	public static void main(String[] args) {
		
		boolean[] b = new boolean[10001]; // 1~10000이하에서 b[0]은 빼고 돌리기 때문에 10001로 설정
		
		for(int i = 1; i < 10001; i++) {
			int n = d(i);
			
			if(n < 10001) { // 10000보다 작거나 같은 수까지만
				b[n] = true; // true 값은 생성자가 있는 숫자라는 뜻
			}
		}
		for(int i = 1; i <10001; i++) {
			if(b[i] != true) {
				System.out.println(i);
			}
		}
	}
	public static int d(int num) {
		int sum = num; // sum 초기값을 number로 설정
		while(num != 0) { // num이 0이 될때까지 반복
			sum = sum +  (num%10); // 첫 째 자리수
			num = num / 10; 
		}
		return sum;
	}
}
