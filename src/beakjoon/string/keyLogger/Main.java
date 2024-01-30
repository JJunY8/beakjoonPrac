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
		int whereAmI = 0;
		
		for(int i = 0; i<commandSize; i++) {
			String[] input = bf.readLine().split("");
			for(String k : input) {
				if(k.equals(">")) {
					//커서 오른쪽으로 이동
					System.out.println(k);
					if(right.isEmpty()!=true) {
						left.push(right.pop());
						System.out.println(right.toString());
						System.out.println(left.toString());
					}else {
						left.push(right.pop());
						System.out.println(right.toString());
						System.out.println(left.toString());
					}
					whereAmI = 0;
				}else if(k.equals("<")) {
					//커서 왼쪽으로 이동
					System.out.println(k);
					if(left.isEmpty()!=true) {
						right.push(left.pop());
						System.out.println(right.toString());
						System.out.println(left.toString());
					}else {
						right.push(left.pop());
						System.out.println(right.toString());
						System.out.println(left.toString());
					}
					whereAmI = 1;
				}else if(k.equals("-")) {
					//지우기
					System.out.println(k);
					if(whereAmI == 0 && left.isEmpty() != true) {
						left.pop();
						System.out.println(right.toString());
						System.out.println(left.toString());
					}
					if(whereAmI == 1 && right.isEmpty() != true){
						right.pop();
						System.out.println(right.toString());
						System.out.println(left.toString());
					}
				}else {
					System.out.println(k);
					if(whereAmI == 0) {
						left.push(k);
						System.out.println(right.toString());
						System.out.println(left.toString());
					}
					if(whereAmI == 1){
						right.push(k);
						System.out.println(right.toString());
						System.out.println(left.toString());
					}
				}
			}
			while(right.isEmpty()!=true) {
				left.push(right.pop());
			}
			
			System.out.println(left.toString());
		}

	}

}
