

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <����>
 * 16���� ������ �Է¹޾� 
 * 8������ ��� 
 */
public class Main_codeup_1035 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine(),16); // 16���� -> 10����
		String octalNum = Integer.toOctalString(num); // 10���� -> 8����
		
		System.out.println(octalNum);
	}
}
