package test_4673;

public class Main {
	public static int get_dn(int num) {
		int rest;
		int num_for_rest = num;
		do {
			rest = num_for_rest % 10;
			num_for_rest /= 10;
			
			num += rest;
		}while(num_for_rest > 0);
		
		return num;
	}
	
	public static void main(String[] args) {
		int self_number[] = new int[10000];
		
		for(int i = 1; i <= 10000; i++) {
			int dn = get_dn(i);
			if(dn <= 10000) {
				self_number[dn - 1] = -1;
			}
			if(self_number[i-1] != -1) {
				self_number[i-1] = i;
			}
		}		
		for(int i = 0; i < 10000; i++) {
			if(self_number[i] != -1) {
				System.out.println(self_number[i]);
			}
		}
	}
}
