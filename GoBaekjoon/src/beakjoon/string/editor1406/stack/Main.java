package beakjoon.string.editor1406.stack;

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
		// sysout보다 이게 더 빠르다! 구현하다가 타임 어쩌고 걸리면 이걸로 구현해라!
		
		String st = new String(bf.readLine());
		int commandSize = Integer.parseInt(bf.readLine());
		Stack<Character> stack1 = new Stack<>();
		Stack<Character> stack2 = new Stack<>();
		
		for(int i = 0; i<st.length(); i++) {
			stack1.push(st.charAt(i));
		}
		
		for(int k=0; k<commandSize; k++) {
			String command = bf.readLine();
			switch(command.charAt(0)) {
				case 'L' :
					if(stack1.empty() != true) {
						stack2.push(stack1.pop());
					}
					break;
				case 'D' :
					if(stack2.empty() != true) {
						stack1.push(stack2.pop());
					}
					break;
				case 'B' :
					if(stack1.empty() != true) {
						stack1.pop();
					}
					break;
				case 'P' :
					stack1.push(command.charAt(2));
					break;
			}
		}
		
		while(!stack1.empty()) {
			stack2.push(stack1.pop());
		}
		
		while(!stack2.empty()) {
			bw.write(stack2.pop());
		}
	
		bw.flush();
		bf.close();
	}

}
