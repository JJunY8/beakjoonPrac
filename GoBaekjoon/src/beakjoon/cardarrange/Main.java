package beakjoon.cardarrange;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String st;
		String[] temp;
		int tempnum;
		int[] num = new int[2];
		int[] card = IntStream.rangeClosed(1, 20).toArray();
		
		for(int i = 0; i < 10; i++) {
			st = bf.readLine();
			temp = st.split(" ");
			num[0] = Integer.parseInt(temp[0]) - 1;
			num[1] = Integer.parseInt(temp[1]) - 1;
			int index = 0;
			for(int k=num[0]; k<num[1]; k++) {
				if((num[1]-index) < k) {
					break;
				}
				tempnum = card[k];
				card[k] = card[num[1] - index];
				card[num[1] - index] = tempnum;
				index++;
			}		
		}
		
		for(int i : card) {
			System.out.print(i);
			System.out.print(" ");
		}
	}
}
