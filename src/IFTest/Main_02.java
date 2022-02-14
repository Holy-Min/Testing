package IFTest;
import java.io.*;

public class Main_02 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
		int A = Integer.parseInt(br.readLine());
			
		System.out.println((A>=90)? "A" : (A>=80)? "B" : (A>=70)? "C":(A>=60)? "D": "F" );
		
	}
}