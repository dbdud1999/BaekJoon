package test_2675;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// 테스트 케이스 개수
		int test_case_num = scanner.nextInt();
		
		for(int i = 0; i < test_case_num; i++) {
			int repeat = scanner.nextInt();
			String str = scanner.next();
			
			for(int j = 0; j < str.length(); j++) {
				for(int k = 0; k < repeat; k++) {
					System.out.print(str.charAt(j));
				}
			}
			
			System.out.println();
		}
	}
}
