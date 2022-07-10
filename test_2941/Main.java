package test_2941;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String croatia_alpha[] = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		
		String croatia_word = sc.next();
		int alpha_num = 0; // 알파벳 개수
		
		int start_idx, end_idx;
		for(int i = 0; i < croatia_alpha.length; i++) {
			// 해당 알파벳이 단어에 들어있지 않을 때까지
			while(croatia_word.indexOf(croatia_alpha[i]) != -1) {
				start_idx = croatia_word.indexOf(croatia_alpha[i]); // 문자 위치 시작
				end_idx = start_idx + croatia_alpha[i].length();	// 문자 위치 끝
										
				croatia_word = croatia_word.substring(0, start_idx) + "@" + croatia_word.substring(end_idx);
				alpha_num++;		// 단어 개수 더하기
			}
		}
		
		System.out.println(alpha_num + croatia_word.replace("@", "").length());
	}
}
