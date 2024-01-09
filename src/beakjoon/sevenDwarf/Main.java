package beakjoon.sevenDwarf;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String[] st = new String[9];
		int stSize = st.length;
		int sum = 0;
		int cha = 100;
		int temp = 0;
		int[] nineDwarf = new int[9];
		int[] sevenDwarf = new int[7];
		
		for(int i=0; i<stSize;i++) {
			st[i] = bf.readLine();
		}
		
		for(int i=0; i<stSize;i++) {
			nineDwarf[i] = Integer.parseInt(st[i]);
		}
		
		Arrays.sort(nineDwarf);
		
		for(int k :nineDwarf) {
			sum += k;
		}
		
		cha = sum-cha;
		
		for(int i=0; i<stSize; i++) {
			temp = cha - nineDwarf[i];
			
		}
		
		for(int k : nineDwarf) {
			temp = cha - k;
			for(int i = 0; i<stSize; i++) {
				if(nineDwarf[i]== temp) {
					
				}else {
					sevenDwarf[i]
				}
			}
		}

	}

}
