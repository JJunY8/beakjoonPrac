package beakjoon.string.roomnumber1475;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;



public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = 
				new BufferedReader(new InputStreamReader(System.in));
		String str= bf.readLine();
		String[] chr = str.split("");
		int[] count = new int[10];
		
		for(String k : chr) {
			int j = Integer.parseInt(k);
			count[j]++;
		}
		
		System.out.println(Arrays.toString(count));
		int six = count[6];
		int nine = count[9];
		
		if(six != 0 && nine != 0) {
			//6, 9 같이 있을 때
			int k = 0;
			if((six+nine)%2 > 0) {
				k = ((six+nine)/2) + 1;
			}else {
				k = (six+nine)/2;
			}
			count[6] = k;
			count[9] = k;
			int max = Arrays.stream(count).max().getAsInt();
			System.out.println(max);
		}else if(six != 0 && nine == 0) {
			//6 혼자 있을 때
			int k = 0;
			if(six%2 > 0) {
				k = (six/2) + 1;
			}else {
				k = six/2;
			}
			count[6] = k;
			int max = Arrays.stream(count).max().getAsInt();
			System.out.println(max);
		}else if(six == 0 && nine != 0) {
			//9 혼자 있을 때
			int k = 0;
			if(nine%2 > 0) {
				k = (nine/2) + 1;
			}else {
				k = nine/2;
			}
			count[9] = k;
			int max = Arrays.stream(count).max().getAsInt();
			System.out.println(max);
		}else {
			//6, 9 모두 없을 때 
			int max = Arrays.stream(count).max().getAsInt();
			System.out.println(max);
		}
		
		
		
	
	/*public static void max(int[] a) {
		int index = 0;
		for(int k = 0; k<a.length; k++) {
			index = ()? :
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader bf = 
				new BufferedReader(new InputStreamReader(System.in));

		String str = bf.readLine();
		char[] chr = str.toCharArray();
		int[] count = {0,0,0,0,0,0,0,0,0,0};
		int m = 0;
		int mindex;
		
		for(char j : chr) {
			int k = Character.getNumericValue(j);
			count[k]++;
		}
		//what is max value's index?
		//System.out.println(max);*/
		
	}

}
