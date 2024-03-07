package beakjoon.string.yosepus1158;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = 
				new BufferedReader(new InputStreamReader(System.in));
		String[] str = bf.readLine().split(" ");
		Queue<Integer> qstr = new LinkedList<>();
		Queue<Integer> result = new LinkedList<>();
		int maxValue = Integer.parseInt(str[0]);
		int Pointer = Integer.parseInt(str[1]);
		
		for(int i=1;i<maxValue+1;i++) {
			qstr.add(i);
		}
		
		while(qstr.isEmpty() != true) {
			
			for(int k = 1; k<Pointer; k++) {
				qstr.add(qstr.poll());
			}
			result.add(qstr.poll());
		}
		
		String result1 = result.toString();
		result1 = result1.replace("[", "<");
		result1 = result1.replace("]", ">");
		System.out.println(result1);
	}

}

/*String[] str = bf.readLine().split(" ");
int[] circleMember = new int[Integer.parseInt(str[0])];
int pointer = Integer.parseInt(str[1])-1;

for(int x = 1; x < circleMember.length+1; x++) {
	circleMember[x-1] = x;
}

System.out.println(Arrays.toString(circleMember));
*/
