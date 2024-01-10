package beakjoon.sevenDwarf;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String[] st = new String[9];
		int[] nineDwarf = new int[9];
		int[] sevenDwarf = new int[7];
		
		int stSize = st.length;
		int sum = 0;
		int cha = 100;
		int index = 0;
		int[] temp = new int[2];
		
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
		
		//여기서부터 배열에서 문제가 생깁니다.
		End:
		for(int i=0; i<stSize; i++) {
			for(int k = 1; k<stSize; k++) {
				if(nineDwarf[k]+nineDwarf[i] == cha) {
					temp[0] = k;
					temp[1] = i;
					break End;
				}
			}
		}
		
		for(int i = 0; i < stSize; i++) {
			if(i != temp[0] && i != temp[1]) {
				sevenDwarf[index] = nineDwarf[i];
				index++;
			}
		}
		
		for(int i=0; i<7; i++) {
			System.out.println(sevenDwarf[i]);
		}

	}

}
