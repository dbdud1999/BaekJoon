package test_2908;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String first_num = sc.next();
		String second_num = sc.next();
		
		String first_num_arr[] = first_num.split("");
		String second_num_arr[] = second_num.split("");
		
		first_num = second_num = "";
		
		for(int i = 2; i >= 0; i--) {
			first_num += first_num_arr[i];
			second_num += second_num_arr[i];
		}
		
		if(Integer.parseInt(first_num) > Integer.parseInt(second_num))
			System.out.println(first_num);
		else // if(Integer.parseInt(second_num) > Integer.parseInt(first_num))
			System.out.println(second_num);
	}
}
