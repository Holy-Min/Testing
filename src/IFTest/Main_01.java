package IFTest;
import java.io.*;

public class Main_01 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		
		System.out.println((A>B)? ">" : ((A<B)? "<" : "=="));
	}
}