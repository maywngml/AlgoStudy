

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * <����>
 * ���� 2���� �Է¹޾� 
 * ���� ���
 * ����: -2147483648 ~ +2147483648
 */
public class Main_codeup_1039 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] twoWord = br.readLine().split(" ");
		System.out.println(Arrays.stream(twoWord).mapToLong(Long::parseLong).sum());
	}
}
