package test_3052;

import java.util.Scanner;

public class Main {
	public static boolean in_array(int[] arr, int num, int idx){
		for(int i = idx; i < arr.length; i++){
			if(num == arr[i] && idx != i)
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int num;
		int count = 0;

		for (int i = 0; i < 10; i++) {
			num = sc.nextInt();
			num %= 42;
			arr[i] = num;
		}
		for (int i = 0; i < 10; i++) {
			if(!in_array(arr, arr[i], i)) {
				count++;
			}
		}

		System.out.println(count);
	}
}
