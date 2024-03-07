package beakjoon.string.keyLogger;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
		
		int commandSize = Integer.parseInt(bf.readLine());
		
		Stack<String> left = new Stack<>();
		Stack<String> right = new Stack<>();
		
		for(int i = 0; i<commandSize; i++) {
			String[] input = bf.readLine().split("");
			for(String k : input) {
				if(k.equals(">")) {
					if(right.isEmpty()!=true) {
						left.push(right.pop());
						System.out.println(left.toString());
						System.out.println(right.toString());
					}
				}else if(k.equals("<")) {
					if(left.isEmpty()!=true) {
						right.push(left.pop());
						System.out.println(left.toString());
						System.out.println(right.toString());
					}
				}else if(k.equals("-") && left.isEmpty()!=true) {
					left.pop();
					System.out.println(left.toString());
					System.out.println(right.toString());
				}else {
					left.push(k);
					System.out.println(left.toString());
					System.out.println(right.toString());
				}
			}
			while(left.isEmpty()!=true) {
				right.push(left.pop());
			}
			
			while(right.isEmpty()!=true) {
				bw.write(right.pop());
			}
			bw.write("\n");
			right.clear();
			left.clear();
		}
		
		bw.flush();
        bw.close();
        bf.close();

	}

}
