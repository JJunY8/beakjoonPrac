package beakjoon.fastab15552;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class FastAplusB {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuffer str = new StringBuffer(bf.readLine());
		int size = Integer.parseInt(str.toString());
		
		for(int i = 0; i<size; i++) {
			StringBuffer str2 = new StringBuffer(bf.readLine());
			String[] st = str2.toString().split(" ");
			Integer result = Integer.parseInt(st[0]) + Integer.parseInt(st[1]);
			bw.write(result.toString()+'\n');
		}
		
		bw.flush();

	}

}
