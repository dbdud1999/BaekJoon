package test_11720;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// 숫자의 개수 n
		int num_num = scanner.nextInt();
		
		String num_str = scanner.next();
		String num_arr[] = num_str.split("");
		
		int sum = 0;
		for(int i = 0; i < num_num; i++) {
			sum += Integer.parseInt(num_arr[i]);
		}
		
		System.out.println(sum);
	}
}
