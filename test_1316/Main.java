package test_1316;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int word_num = sc.nextInt();
		String alpha = "abcdefghijklmnopqrstuvwxyz";
		String alpha_arr[] = alpha.split("");
		
		String word[] = new String[word_num];
		int group_word_cnt = word_num;	// 모든 단어가 그룹함수라고 가정
		
		for(int i = 0; i < word_num; i++)
			word[i] = sc.next();
		
		// 문자열 하나로 만들기
		for(int i = 0; i < word.length; i++) {
			for(int j = 0; j < alpha_arr.length; j++) {
				while(word[i].contains(alpha_arr[j] + alpha_arr[j])) {	// 문자열이 두개 연속될 경우
					word[i] = word[i].replace(alpha_arr[j] + alpha_arr[j], alpha_arr[j]); // 하나로 만듦
				}
			}
		}
		
		for(int i = 0; i < word.length; i++) {
			for(int j = 0; j < alpha_arr.length; j++) {
				int cnt = 0;
				if(word[i].contains(alpha_arr[j])) {
					while(word[i].contains(alpha_arr[j])) {
						cnt++;
						word[i] = word[i].replaceFirst(alpha_arr[j], "");
					}
					if(cnt > 1) {		// 그룹함수가 아닐 경우
						group_word_cnt--;	// 하나씩 빼기
						break;
					}
				}
			}
		}
		
		System.out.println(group_word_cnt);
		
	}
}
