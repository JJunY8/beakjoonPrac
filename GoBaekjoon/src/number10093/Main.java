package number10093;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.LongStream;

public class Main {
	public static void main(String[] args) throws IOException {
		//input과 output의 자료형 범위를 확인합시다.
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String st = bf.readLine();
		long num1;
		long num2;
		long tmp;
		String[] temp = st.split("\\s");
		
		num1 = Long.parseLong(temp[0]);
		num2 = Long.parseLong(temp[1]);
		
		if(num1>num2) {
			tmp = num1;
			num1 = num2;
			num2 = tmp;
		}
		
		
		long[] midRange = LongStream.rangeClosed(num1+1, num2-1).toArray();
		
		System.out.println(midRange.length);
		
		for(int i=0; i<midRange.length; i++) {
			System.out.print(midRange[i]);
			System.out.print(" ");
		}
		
	}
}
