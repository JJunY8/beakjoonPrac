package beakjoon.string.countA10808;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String st = bf.readLine();
		String[] tmp = st.split("");
		String[] al = "abcdefghijklmnopqrstuvwxyz".split("");
		
		int count;
		
		for(String a : al) {
			count = 0;
			for(String b : tmp) {
				if(b.equals(a)) {
					count++;
				}
			}
			System.out.print(count);
			System.out.print(" ");
			
		}
		bf.close();

	}

}
