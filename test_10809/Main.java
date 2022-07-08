package test_10809;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String word = scanner.next();
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String alphabet_arr[] = new String[alphabet.length()];
		
		// -1로 초기화
		for(int i = 0; i < alphabet_arr.length; i++) {
			alphabet_arr[i] = "-1";
		}
		
		
		for(int i = 0; i < word.length(); i++) {
			int location = alphabet.indexOf(word.charAt(i));
			if(alphabet_arr[location].equals("-1"))
				alphabet_arr[location] = Integer.toString(i);
		}
		
		System.out.println(String.join(" ", alphabet_arr));
	}
}