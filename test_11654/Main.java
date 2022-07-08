package test_11654;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// char형 문자 입력받는 법
		char ascii = scanner.next().charAt(0);
		System.out.println((int)ascii);
	}
}
