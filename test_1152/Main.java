package test_1152;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String sentence = sc.nextLine();
		String sentence_arr[] = sentence.trim().split(" ");
		
		if(!sentence.trim().equals(""))
			System.out.println(sentence_arr.length);
		else
			System.out.println(0);
	}
}
