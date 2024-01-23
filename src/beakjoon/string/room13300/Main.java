package beakjoon.string.room13300;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = 
				new BufferedReader(new InputStreamReader(System.in));
		
		int[] arrF = {0,0,0,0,0,0};
		int[] arrM = {0,0,0,0,0,0};
		
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int allst = Integer.parseInt(st.nextToken());
		int max = Integer.parseInt(st.nextToken());
		int room = 0;
		
		for(int i = 0; i<allst; i++) {
			StringTokenizer st1 = new StringTokenizer(bf.readLine());
			
			if(st1.nextToken().equals("0")) {
				int j = Integer.parseInt(st1.nextToken());
				arrF[j-1]++;
			}else {
				int j = Integer.parseInt(st1.nextToken());
				arrM[j-1]++;
			}
		}
		
		for(int f : arrF) {
			int result = (f%max > 0) ? (f/max)+1 : (f/max);
			room += result;
		}
		
		for(int m : arrM) {
			int result = (m%max > 0) ? (m/max)+1 : (m/max);
			room += result;
		}
		
		System.out.println(room);
	}

}
