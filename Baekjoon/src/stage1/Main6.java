package stage1;

import java.util.Scanner;

public class Main6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt(); // int 입력
		
		int B = sc.nextInt(); // int 입력
		
		System.out.println(A+B);
		System.out.println(A-B);
		System.out.println(A*B);
		System.out.println(A/B);
		System.out.println(A%B);
		
		//Scanner 닫기
		sc.close();

	}

}
