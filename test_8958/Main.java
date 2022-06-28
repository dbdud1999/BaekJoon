package test_8958;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int quiz_num = sc.nextInt(); // 테스트 케이스의 개수
		
		for(int i = 0; i < quiz_num; i++) {
			String quiz_answer 			= sc.next();
			String[] quiz_answer_arr	= quiz_answer.split(""); 
			
			int score = 0;
			int score_unit = 0;
			for(int j = 0; j < quiz_answer_arr.length; j++) {
				score_unit++;
				if(quiz_answer_arr[j].equals("O"))
					score += score_unit;
				else if(quiz_answer_arr[j].equals("X"))
					score_unit = 0;
			}
			System.out.println(score);
		}
	}
}
