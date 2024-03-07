package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String[] st = new String[9];
		int stSize = st.length;
		int[] nineDwarf = new int[9];
		
		int index= 0;
		
		for(int i=0; i<stSize;i++) {
			st[i] = bf.readLine();
		}
		
		for(String i : st) {
			nineDwarf[index] = Integer.parseInt(i);
			index++;
		}
		
		SevenDwarf dwarfs = new SevenDwarf(nineDwarf);
		
		dwarfs.sort();
		dwarfs.pickSeven();
		
		
	}

}
