package day04;

public class Exam02 {

	public static void main(String[] args) {
		/*
		 * ������ �迭�� �Է��ϵ� �� ��ġ�� �����ϰ� ���ϰ� 1���� 100������ ���� �����ÿ� 0�ڸ���
		 */
		int[] arr = new int[5];// 00000
		int n = 0;
		while (n < arr.length) {
			int col = (int) (Math.random() * 5);// �迭��ġ
			System.out.println("��ġ col:" + col + "\t");
			if (arr[col] != 0) {// �̹� ���� �������
				continue;
			} else {// �迭�� ����ִ� �� 0
				arr[col] = (int) (Math.random() * 100) + 1;
				n++;
			}

		} // while
		for (int a : arr) {
			System.out.print(a + "\t");
		}
	}
}