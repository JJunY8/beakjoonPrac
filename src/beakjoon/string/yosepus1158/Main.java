package beakjoon.string.yosepus1158;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = 
				new BufferedReader(new InputStreamReader(System.in));
		String[] str = bf.readLine().split(" ");
		int maxValue = Integer.parseInt(str[0]);
		int fstPointer = Integer.parseInt(str[1]);
		LinkedList<Integer> list = new LinkedList<>();
		
		System.out.println(list.get(fstPointer));
		
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
