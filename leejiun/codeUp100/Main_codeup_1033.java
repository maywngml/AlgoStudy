

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * 10������ �Է¹޾� 16���� �빮�ڷ� ���. 
 * �Է� ����: int ����
 *
 */
public class Main_codeup_1033 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// sol1.
//		String hexNum = Integer.toHexString(Integer.parseInt(br.readLine())).toUpperCase();
//		System.out.println(hexNum);
		
		// sol2.
		System.out.printf("%X",Integer.parseInt(br.readLine()));
	}
}
