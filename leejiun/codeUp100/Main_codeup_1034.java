

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <����>
 * 8���� ������ �Է¹޾� 
 * 10������ ��� 
 * 
 * <Ǯ�̹��>
 * 1. String���� �Է¹޴´�.
 * 2. int len = �Է� ���ڿ��� ����
 * 	  int num = 0
 * 3. �� ���� ���� ���ڿ��� ��ȸ
 * 	  3.1. num += ���� ����.toInt * 8�� (len - i - 1) ����
 * 4. num(���� 10����) ���
 */
public class Main_codeup_1034 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String octalNum = br.readLine(); // 1
		int len = octalNum.length(); // 2
		int num = 0;
		
		for (int i = 0; i < len; i++) {// 3
			int currentNum = octalNum.charAt(i) -'0';  // ���� ���ڸ� int������ ��ȯ
			int square = len - i - 1; // ������ ���ϱ�
			num += currentNum * Math.pow(8, square); // ���� ���� ��ȯ����� ���� 10������ ���ϱ�.
		}
		System.out.println(num);
	}
}
