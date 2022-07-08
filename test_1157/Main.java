package test_1157;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lower_case = "abcdefghijklmnopqrstuvwxyz";
		int alpha_arr[] = new int[upper_case.length()];
		
		String word = scanner.next();
		
		for(int i = 0; i < word.length(); i++) {
			int upper_case_index = upper_case.indexOf(word.charAt(i));
			int lower_case_index = lower_case.indexOf(word.charAt(i));
			
			// 알파벳이 속할 때마다 알파벳 배열에 1씩 더하기
			if(upper_case_index >= 0)
				alpha_arr[upper_case_index]++;
			if(lower_case_index >= 0)
				alpha_arr[lower_case_index]++;
		}
		
		// 최댓값 찾기
		int max = 0;
		char max_alpha = '?';
		for(int i = 0; i < alpha_arr.length; i++) {
			if(max == alpha_arr[i])
				max_alpha = '?';
			else if (max < alpha_arr[i]) {
				max = alpha_arr[i];
				max_alpha = upper_case.charAt(i);
			}
		}
		System.out.println(max_alpha);
	}
}
