

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <����>
 * ���ڸ� �Է¹޾� 
 * 10������ ��� 
 */
public class Main_codeup_1036 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char ch = br.readLine().charAt(0); // ���� �Է�
		
		System.out.println(ch-'\0'); // �ƽ�Ű �ڵ�� ��ȯ
		//System.out.println('1'-'0'); // int������ ��ȯ
	}
}
