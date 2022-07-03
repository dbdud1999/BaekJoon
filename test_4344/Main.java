package test_4344;

import java.util.Scanner;

public class Main {
	// 평균 구하기
	public static int get_average(int[] arr) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		int average = sum/arr.length;
		
		return average;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int test_case = sc.nextInt();	// 테스트 케이스의 개수
		
		for(int i = 0; i < test_case; i++) {
			int student_num		= sc.nextInt();	// 학생의 수
			int[] student_score	= new int[student_num];
			for(int j = 0; j < student_num; j++) {
				student_score[j] = sc.nextInt();
			}
			int score_average = get_average(student_score);
			int over_average_student_num = 0; // 평균을 넘는 학생
			for(int j = 0; j < student_num; j++) {
				if(student_score[j] > score_average)	// 평균을 넘을 경우
					over_average_student_num++;
			}
			double over_average_student_percent = (double)over_average_student_num/(double)student_num*100;
			System.out.println(String.format("%.3f", over_average_student_percent) + "%");
		}
	}
}
