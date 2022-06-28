package test_1546;

import java.util.Scanner;

public class Main {
	// 최댓값 구하기
	public static double get_max(double[] arr) {
		double max = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if(max < arr[i])
				max = arr[i];
		}
		
		return max;
	}
	
	// 평균 구하기
	public static double get_average(double[] arr) {
		double sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		double average = sum/arr.length;
		
		return average;
	}
	
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		int test_num = sc.nextInt(); // 시험 본 과목의 개수
		
		double[] test_score = new double[test_num]; // 세준이의 현재 성적
		
		for(int i = 0; i < test_score.length; i++) {
			// 성적 입력
			test_score[i] = sc.nextDouble();
		}
		
		double max_score = get_max(test_score);
		
		double[] modify_score = new double[test_score.length]; // 조작된 성적
		for(int i = 0; i < test_score.length; i++) {
			modify_score[i] = test_score[i]/max_score*100;
		}
		
		System.out.println(get_average(modify_score));
		
		
	}
}
