package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_Baekjoon_1269_������{
	static final int MAX = 100000000;// �ִ� ������ ����
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		// �� �迭�� ũ�� �Է� (input: 1'st line)
		int aSize = Integer.parseInt(st.nextToken());
		int bSize = Integer.parseInt(st.nextToken()); 

		int[] arrA = new int[aSize];
		int[] arrB = new int[bSize];
		
		// A�迭 �Է�(input: 2nd line)
		st = new StringTokenizer(br.readLine()," ");
		for (int i = 0; i < aSize; i++) {
			arrA[i] = Integer.parseInt(st.nextToken());
		}
		
		// B�迭 �Է�(input: 3rd line)
		st = new StringTokenizer(br.readLine()," ");
		for (int i = 0; i < bSize; i++) {
			arrB[i] = Integer.parseInt(st.nextToken());
		}

		// A-B, B-A �������� �� ������ ���Ѵ�.
		// ���Ѱ��� ����Ѵ�.
		System.out.println(getDifferenceSetSize(arrA,arrB,aSize,bSize)+getDifferenceSetSize(arrB,arrA,bSize,aSize));
		
	}// end of main

	/**
	 * name: getDifferenceSetSize
	 * description: ���� ���հ� Ÿ�� ������ �������� ���ϰ�, �������� ũ�⸦ ��ȯ�Ѵ�.
	 * @param standard_arr: ���� ����
	 * @param target_arr: Ÿ�� ����
	 * @param standard_size: ���� ������ ũ��
	 * @param target_size: Ÿ�� ������ ũ��
	 * @return cnt (�������� ũ��)
	 */
	private static int getDifferenceSetSize(int[] standard_arr, int[] target_arr,int standard_size,int target_size) {
		boolean[] contains = new boolean[MAX]; // �������� �������� ǥ���ϴ� �迭
		int cnt = 0; //�������� ũ�⸦ ������ ����
		
		// 1. ���� ����(standard_arr)�� ���ҵ��� ǥ���Ѵ�.
		for (int i = 0; i < standard_size; i++) {
			contains[standard_arr[i]] = true;
			cnt++; // �ʱ� ���� ���� ����
		}
		
		// 2. Ÿ�� ����(target_arr)�� ������ ���ش�.
		for (int i = 0; i < target_size; i++) {
			int targetIndex = target_arr[i];
			if(contains[targetIndex]) {
				contains[targetIndex] = false; // ������ ���� ����
				cnt--; // �׸�ŭ ������ ���ֱ�.
			}
		}
		
		return cnt; // ������ ���� ����
	}
}// end of class