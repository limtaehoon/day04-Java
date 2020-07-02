package day04;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		/*10개의 수를 입력받아 배열에 넣고
		 * 그배열의 함계와 가장작은수 구하기
		 */
 Scanner sc= new Scanner(System.in);
 System.out.println("100보다 작은숫자 10개를 입력하세요");
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
			
			System.out.println("최소값:"+min);
			System.out.println("합계:"+sum);
			for(int a:arr) {
				System.out.println(a);
		}
			
		
	}
	

}