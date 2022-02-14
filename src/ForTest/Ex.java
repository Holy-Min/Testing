package ForTest;

public class Ex {
	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-----");
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("!");
			}
			for(int j = 0; j < 5-2*i; j++) {
				System.out.print("*");
			}
			for(int j = 0; j < i; j++) {
				System.out.print("!");
			}
			System.out.println();
		}
		System.out.println("-----");
		
		int row = 3;
		for(int i = 1; i <= 3; i++) {
			for(int j = 0; j < row-i; j++) {
				System.out.print("!");
			}
			for(int j = 0; j < 2*i-1; j++) {
				System.out.print("*");
			}
			for(int j = 0; j < row-i; j++) {
				System.out.print("!");
			}
			System.out.println();
		}
		System.out.println("-----");
		for(int i = 1; i <= 5; i++) {
			if(i < 3 ) {
				for(int j = 0; j < 3-i; j++) {
					System.out.print("!");
				}
				for(int j = 0; j < 2*i-1; j++) {
					System.out.print("*");
				}
				for(int j = 0; j < 3-i; j++) {
					System.out.print("!");
				}				
			}else {
				for(int j = 0; j < i-3; j++) {
					System.out.print("!");
				}
				for(int j = 0; j < 11-(2*i); j++) {
					System.out.print("*");
				}
				for(int j = 0; j < i-3; j++) {
					System.out.print("!");
				}
			}
			System.out.println();
		}
		System.out.println("-----");
		for(int i = 1; i <= 2; i++) {
			for(int j = 0; j < 3-i; j++) {
				System.out.print("!");
			}
			for(int j = 0; j < 2*i-1; j++) {
				System.out.print("*");
			}
			for(int j = 0; j < 3-i; j++) {
				System.out.print("!");
			}
			System.out.println();
		}
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("!");
			}
			for(int j = 0; j < 5-2*i; j++) {
				System.out.print("*");
			}
			for(int j = 0; j < i; j++) {
				System.out.print("!");
			}
			System.out.println();
		}
	}
}
