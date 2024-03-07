package beakjoon.string.countN10807;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String stSize = bf.readLine();
		String stNumbers = bf.readLine();
		String stFind = bf.readLine();
		
		int intSize = Integer.parseInt(stSize);
		String[] tmpNumbers = stNumbers.split(" ");
		int intFind = Integer.parseInt(stFind);
		int count = 0;
		
		for(String i : tmpNumbers) {
			if(Integer.parseInt(i) == intFind) {
				count++;
			}
		}
		
		System.out.print(count);
		
		bf.close();
		
	}
}
