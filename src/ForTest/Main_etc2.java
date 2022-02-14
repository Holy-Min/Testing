package ForTest;

public class Main_etc2 {
	public static void main(String[] args) {
		
		for(int i = 1; i < 6; i++) {
			for(int j = 1; j < 6; j++) {
				int k = 6;				
				if( j > k-i) {
					System.out.print("!");
				}
			}
			System.out.println();
		}
		
	}
}
