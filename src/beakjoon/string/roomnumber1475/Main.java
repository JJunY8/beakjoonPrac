package beakjoon.string.roomnumber1475;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;



public class Main {
	
	public static void max(int[] a) {
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
		
		
		
		
		
		//System.out.println(max);
		
	}

}
