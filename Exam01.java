package day04;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		/*10���� ���� �Է¹޾� �迭�� �ְ�
		 * �׹迭�� �԰�� ���������� ���ϱ�
		 */
 Scanner sc= new Scanner(System.in);
 System.out.println("100���� �������� 10���� �Է��ϼ���");
 int []arr=new int[10];
 int sum=0;
 int min=100;
 for(int i=0;i<10;i++)     {
arr[i]=sc.nextInt();
	sum+=arr[i];
		if(min>arr[1]) {
			min=arr[i];
		}
 }
			
			System.out.println("�ּҰ�:"+min);
			System.out.println("�հ�:"+sum);
			for(int a:arr) {
				System.out.println(a);
		}
			
		
	}
	

}