package beakjoon.string.strfry11328.que;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = 
				new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = 
				new BufferedWriter(new OutputStreamWriter(System.out));
		int repeatSize = Integer.parseInt(bf.readLine());
		
		Stack stackstr = new Stack<>();    
		Queue<Character> queustr = new LinkedList<>();
		int indexmax;
		int index;
		
		for(int i = 0; i<repeatSize; i++) {
			
			String[] str = bf.readLine().split(" ");
			indexmax = str[0].length();
			
			if(indexmax != str[1].length()) {
				System.out.println("Impossible");
			}else {
				for(int k = 0; k < indexmax; k++) {
					stackstr.push(str[0].charAt(k));
					queustr.add(str[1].charAt(k));
				}
				index = 0;
				
				while(true) {
					
					if(stackstr.peek() == queustr.peek()) {
						stackstr.pop();
						queustr.remove();
						index = 0;
						indexmax--;
					}else {
						queustr.add(queustr.poll());
						index++;
					}
					
					if(index == indexmax && indexmax != 0) {
						System.out.println("Impossible");
						break;
					}
					
					if(stackstr.size() == 0 && queustr.size() == 0) {
						System.out.println("Possible");
						break;
					}
					
				}
			}
			
			stackstr.clear();
			queustr.clear();
			
			//작업 후에 스택과 큐를 꼭 비웁시다.
			
		}
		
	}
}
