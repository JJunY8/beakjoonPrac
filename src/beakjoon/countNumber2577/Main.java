package beakjoon.countNumber2577;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		//세 자연수의 곱의 최대값은 997,002,999이다. 입력값은 네 자리를 넘지 않으니 int로 접근하자.
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] st = new String[3];
		int[] count = {0,0,0,0,0,0,0,0,0,0};
		String tempst;
		String[] temp2;
		
		for(int i=0; i<3;i++) {
			st[i] = bf.readLine();
		}
		
		int num1 = Integer.parseInt(st[0]);
		int num2 = Integer.parseInt(st[1]);
		int num3 = Integer.parseInt(st[2]);
		
		//대충 10^9인데 해보니까 오류나더라... long 타입으로 받읍시다.
		long mul = num2*num3;
		mul = mul*num1;
		
		tempst = String.valueOf(mul);
		temp2 = tempst.split(""); 
		
		for(int i = 0; i<temp2.length; i++) {
			
			count[Integer.parseInt(temp2[i])] += 1;
			
		}
		
		for(int i : count) {
			System.out.println(i);
		}
		
		
		
	}
}
