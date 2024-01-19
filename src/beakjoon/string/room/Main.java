package beakjoon.string.room;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = 
				new BufferedReader(new InputStreamReader(System.in));
		
		String[] stat = bf.readLine().split(" ");
		int studentSize = Integer.parseInt(stat[0]);
		int roomSize = Integer.parseInt(stat[1]);
		StringBuffer student =  new StringBuffer();
		
		for(int i = 0; i<studentSize; i++) {
			student.append(bf.readLine().replace(" ", ""));
		}

		
	}

}
