package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ValueSetting {
	
	public int mean(int[] arr) {
		int sum = 0;
		int meanValue;
		int arrSize = arr.length;
		for(int i : arr) {
			sum += i;
		}
		meanValue = sum/arrSize;
		return meanValue;
		
	}
	
	public int median(int[] arr) {
		int arrSize = arr.length;
		int medianIndex;
		if(arrSize%2 != 0) {
			medianIndex = Math.round(arrSize/2);
		}else {
			medianIndex = 0;
		}
		Arrays.sort(arr);
		return  arr[medianIndex];
	}
	
	/*public static int max(int a, int b) {
		return a > b ? a : b;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] st = new String[5];
		int stSize = st.length;
		int[] arrInt = new int[stSize];
		int sum = 0;
		
		for(int i = 0; i < stSize; i++) {
			st[i] = bf.readLine();
			arrInt[i] = Integer.parseInt(st[i]);
			sum += arrInt[i];
		}
		
		Arrays.sort(arrInt);
		
		System.out.println((int)sum/stSize);
		System.out.println(arrInt[2]);
		
	}*/
	
}
