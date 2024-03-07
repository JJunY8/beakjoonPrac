package beakjoon.string.strfry11328;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {

	public static void main(String[] args)  throws IOException {
		BufferedReader bf = 
				new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = 
				new BufferedWriter(new OutputStreamWriter(System.out));
		String[] str;
		int compareSize = Integer.parseInt(bf.readLine());
		
		Stack<Character> stack1 = new Stack<>();
		Stack<Character> stack2 = new Stack<>();
		Stack<Character> tmp = new Stack<>();
 		
		for(int i = 0; i<compareSize; i++) {
			str = bf.readLine().split(" ");
			
			if(str[0].length() != str[1].length()) {
				bw.write("Impossible");
			}else {
				for(int k = 0; k<str[0].length(); k++) {
					stack1.push(str[0].charAt(k));
					stack2.push(str[1].charAt(k));
				}
				
				while(stack1.isEmpty() || tmp.isEmpty()) {
					if(stack1.peek() != stack2.peek()) {
						tmp.push(stack1.pop());
					}else if(stack1.isEmpty()){
						if(tmp.peek() == stack2.peek()) {
							tmp.pop();
							stack2.pop();
						}else {
							stack1.push(tmp.pop());
						}
					}else{
						stack1.pop();
						stack2.pop();
						if(stack1.size()+tmp.size() == stack2.size()) {
							bw.write("Impossible");
							break;
						}
					}
				}
			}
			
			stack1.removeAllElements();
			stack2.removeAllElements();
			tmp.removeAllElements();
		}

	}

}
