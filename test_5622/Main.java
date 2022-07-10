package test_5622;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 다이얼 설정
		HashMap<Integer, String> dial = new HashMap<>();
		dial.put(2, "ABC");
		dial.put(3, "DEF");
		dial.put(4, "GHI");
		dial.put(5, "JKL");
		dial.put(6, "MNO");
		dial.put(7, "PQRS");
		dial.put(8, "TUV");
		dial.put(9, "WXYZ");
		
		String dial_msg = sc.next();	// 영문 번호
		String dial_msg_arr[] = dial_msg.split("");
		int dial_time = 0;			// 실제 번호
		
		
		for(int i = 0; i < dial_msg_arr.length; i++) {
			Iterator<Integer> numbers = dial.keySet().iterator();
			while(numbers.hasNext()) {
				int num = numbers.next();
				if(dial.get(num).indexOf(dial_msg_arr[i]) >= 0)
					dial_time += num + 1;
			}
		}
		System.out.println(dial_time);
	}
}
